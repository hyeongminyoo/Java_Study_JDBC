package com.iu.regions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegionsView {
	
	//view
	
	public void view(ArrayList<RegionsDTO> ar) throws Exception {
		
		System.out.println("Region_ID \t Region_name");
		System.out.println("--------------------------------");
		for(RegionsDTO rDTO : ar) {
			System.out.println(rDTO.getRegion_id()+"\t "+rDTO.getRegion_name());
		}
		System.out.println("--------------------------------");
	}
}
