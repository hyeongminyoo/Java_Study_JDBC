package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class CountriesDAO {
	
	public void getList() throws Exception {
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		
		//Query문 작성
		String sql = "SELECT * FROM COUNTRIES";
		
		//3.Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//최종 전송후 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			String cid = rs.getString("COUNTRY_ID");
			String name = rs.getString("COUNTRY_NAME");
			int rid = rs.getInt("REGION_ID");
			System.out.println(cid + ":" + name + ":" + rid);
//			System.out.println(name);
		}
		

	}

}
