package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {
	
	//getSalaryInfo
	public void getSalaryInfo() throws Exception {
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		//2.쿼리문 작성
		String sql = "SELECT SUM(SALARY), AVG(SALARY), MAX(SALARY) AS MAX FROM EMPLOYEES";
		//3.미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 있을경우 값 세팅
		
		//5. 최종 전송 및 결과처리
		ResultSet rs = st.executeQuery();
		ArrayList<Object> ar = new ArrayList<>();
		if(rs.next()) {
			int sum = rs.getInt("SUM(SALARY)");
			double avg = rs.getDouble(2);
			int max = rs.getInt("MAX");
			System.out.println(sum);
			System.out.println(avg);
			System.out.println(max);
		}
		
		
		//6. 자원해제
		DBConnector.disConnect(rs, st, con);
	}
	
	
	
	
	//1.Employees 의 모든 데이터 가져오기
	public ArrayList<EmployeesDTO> getList() throws Exception {
		
		ArrayList<EmployeesDTO> ar = new ArrayList();
		
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		
		//2.쿼리문 작성
		String sql = "SELECT * FROM EMPLOYEES";
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. 최종 전송 및 결과처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			EmployeesDTO employeesDTO = new EmployeesDTO();
			employeesDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeesDTO.setFirst_name(rs.getString("FIRST_NAME"));
			employeesDTO.setLast_name(rs.getString("LAST_NAME"));
			employeesDTO.setEmail(rs.getString("PHONE_NUMBER"));
			employeesDTO.setHire_date(rs.getDate("HIRE_DATE"));
			employeesDTO.setJob_id(rs.getString("JOB_ID"));
			employeesDTO.setSalary(rs.getDouble("SALARY"));
			employeesDTO.setCommission_pct(rs.getDouble("COMMISSION_PCT"));
			employeesDTO.setManager_id(rs.getInt("MANAGER_ID"));
			employeesDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			
			ar.add(employeesDTO);
			
		}
		
		DBConnector.disConnect(rs, st, con);
		
		return ar;
		
		
	}
	
	//2. 사번으로 가져오기
	public EmployeesDTO getDetail(int employee_id) throws Exception {
		EmployeesDTO employeesDTO = new EmployeesDTO();
		
		//1.DB 접속
		Connection con = DBConnector.getConnection();
		
		//2.쿼리문 작성
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
		
		//3.미리전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.? 세팅
		st.setInt(1, employee_id);
		
		//5. 최종 전송 및 결과처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			employeesDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeesDTO.setFirst_name(rs.getString("FIRST_NAME"));
			employeesDTO.setLast_name(rs.getString("LAST_NAME"));
			employeesDTO.setEmail(rs.getString("PHONE_NUMBER"));
			employeesDTO.setHire_date(rs.getDate("HIRE_DATE"));
			employeesDTO.setJob_id(rs.getString("JOB_ID"));
			employeesDTO.setSalary(rs.getDouble("SALARY"));
			employeesDTO.setCommission_pct(rs.getDouble("COMMISSION_PCT"));
			employeesDTO.setManager_id(rs.getInt("MANAGER_ID"));
			employeesDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
		}
		
		DBConnector.disConnect(rs, st, con);
		
		return employeesDTO;
	}
	
	
}
