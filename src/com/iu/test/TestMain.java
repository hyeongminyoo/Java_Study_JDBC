package com.iu.test;

import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.countries.CountriesDTO;
import com.iu.countries.CountriesView;
import com.iu.employees.EmployeesDAO;
import com.iu.employees.EmployeesDTO;
import com.iu.employees.EmployeesView;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		
	
		ArrayList<RegionsDTO> ar = new ArrayList();
		ArrayList<CountriesDTO> ar2 = new ArrayList();
		ArrayList<EmployeesDTO> ar3 = new ArrayList();
		RegionsDAO regionsDAO = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		RegionsView regionsView = new RegionsView();
		CountriesView countriesView = new CountriesView();
		EmployeesDAO employeesDAO = new EmployeesDAO();
		EmployeesView employeesView = new EmployeesView();
		
		
		try {
//			ar = regionsDAO.getList();
//			ar = regionsDAO.getDetail(6);
//			regionsView.view(ar);
//			ar2 = countriesDAO.getList();
//			ar2 = countriesDAO.getDetail("CH");
//			countriesView.view(ar2);
//			ar3 = employeesDAO.getList();
//			employeesView.view(ar3);
//			employeesDAO.getSalaryInfo();
//			RegionsDTO regionsDTO = new RegionsDTO();
//			regionsDTO.setRegion_id(6);
//			regionsDTO.setRegion_name("Mars");
//			int result = regionsDAO.setRegion(regionsDTO);
			
			CountriesDTO countriesDTO = new CountriesDTO();
			countriesDTO.setCountry_id("CU");
			countriesDTO.setCountry_name("Cuba");
			countriesDTO.setRegion_id(5);
			int result = countriesDAO.setCountry(countriesDTO);
			if(result>0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
