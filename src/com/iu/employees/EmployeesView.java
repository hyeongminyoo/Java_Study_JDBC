package com.iu.employees;

import java.util.ArrayList;

public class EmployeesView {

	public void view(EmployeesDTO employeesDTO) {
		
		System.out.println(employeesDTO.getEmployee_id());
		System.out.println(employeesDTO.getFirst_name());
		System.out.println(employeesDTO.getLast_name());
		System.out.println(employeesDTO.getEmail());
		System.out.println(employeesDTO.getPhone_number());
		System.out.println(employeesDTO.getHire_date());
		System.out.println(employeesDTO.getJob_id());
		System.out.println(employeesDTO.getSalary());
		System.out.println(employeesDTO.getCommission_pct());
		System.out.println(employeesDTO.getManager_id());
		System.out.println(employeesDTO.getDepartment_id());
		
	}
	
	public void view(ArrayList<EmployeesDTO> ar) {
		for(EmployeesDTO employeesDTO : ar) {
			System.out.print(employeesDTO.getEmployee_id());
			System.out.print("\t"+employeesDTO.getFirst_name());
			System.out.print("\t"+employeesDTO.getLast_name());
			System.out.print("\t"+employeesDTO.getEmail());
			System.out.print("\t"+employeesDTO.getPhone_number());
			System.out.print("\t"+employeesDTO.getHire_date());
			System.out.print("\t"+employeesDTO.getJob_id());
			System.out.print("\t"+employeesDTO.getSalary());
			System.out.print("\t"+employeesDTO.getCommission_pct());
			System.out.print("\t"+employeesDTO.getManager_id());
			System.out.println("\t"+employeesDTO.getDepartment_id());
		}
	}
	
	
	
}
