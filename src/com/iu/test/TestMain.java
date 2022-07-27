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
			ar3 = employeesDAO.getList();
			employeesView.view(ar3);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
