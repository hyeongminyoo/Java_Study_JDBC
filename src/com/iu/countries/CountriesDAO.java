package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class CountriesDAO {
	
	//getDetail : countries_id 이용
	public ArrayList<CountriesDTO> getDetail(String country_id) throws Exception {
		
		ArrayList<CountriesDTO> ar = new ArrayList();
		//1.DB연결
		Connection con = DBConnector.getConnection();
		//2.쿼리문 작성
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = ?";
		//3.쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4.?값 세팅
		st.setString(1, country_id);
		//5.최종전송후 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			CountriesDTO countriesDTO = new CountriesDTO();
			countriesDTO.setCountry_id(rs.getString("COUNTRY_ID")); 
			countriesDTO.setCountry_name(rs.getString("COUNTRY_NAME"));  
			countriesDTO.setRegion_id(rs.getInt("REGION_ID"));   
			ar.add(countriesDTO);
		}
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;
		
	}
	
	
	
	
	public ArrayList<CountriesDTO> getList() throws Exception {
		
		ArrayList<CountriesDTO> ar = new ArrayList();
		
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		
		//Query문 작성
		String sql = "SELECT * FROM COUNTRIES";
		
		//3.Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//최종 전송후 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			CountriesDTO countriesDTO = new CountriesDTO();
			countriesDTO.setCountry_id(rs.getString("COUNTRY_ID")); 
			countriesDTO.setCountry_name(rs.getString("COUNTRY_NAME"));  
			countriesDTO.setRegion_id(rs.getInt("REGION_ID"));   
			ar.add(countriesDTO);
		}
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;

	}

}
