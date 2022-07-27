package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class RegionsDAO {

	
	//2. Regions에서 하나의 결과(row)
	public ArrayList<RegionsDTO> getDetail(int region_id) throws Exception {
		
		ArrayList<RegionsDTO> ar = new ArrayList();
		
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		
		//2.Query문 작성
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID = ?";
		
		//3.미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		//WHERE NUM BETWEEN ?(1) AND ?(2);
		st.setInt(1, region_id);
		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		
		while(rs.next()) {
			RegionsDTO rDTO = new RegionsDTO();
			rDTO.setRegion_id(rs.getInt("REGION_ID")); 
			rDTO.setRegion_name(rs.getString("REGION_NAME"));
			ar.add(rDTO);
		}
		
		
		DBConnector.disConnect(rs, st, con);
		return ar;
		
		
	}
	
	//1.Regions 의 모든 데이터 가져오기
	public ArrayList<RegionsDTO> getList() throws Exception {
		
		ArrayList<RegionsDTO> ar = new ArrayList();
		
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
			RegionsDTO rDTO = new RegionsDTO();
			rDTO.setRegion_id(rs.getInt("REGION_ID"));
			rDTO.setRegion_name(rs.getString("REGION_NAME"));
			ar.add(rDTO);
		}
		
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;
		
	}
	
	
	
}
