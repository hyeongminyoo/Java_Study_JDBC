package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class RegionsDAO {

	//1.Regions 의 모든 데이터 가져오기
	public void getList() throws Exception {
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. Query문 작성 (마지막 세미콜론 X)
		String sql = "SELECT * FROM REGIONS";
		
		//3. Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. 
		
		//5. 최종 전송 후 결과를 처리
		// 최종 실행한 결과물을 resultset에 담음
		ResultSet rs = st.executeQuery();
		
		//
		while(rs.next()) {
			int id = rs.getInt("REGION_ID");
			String name = rs.getString("REGION_NAME");
			System.out.println(id);
			System.out.println(name);
		}
	}
	
}
