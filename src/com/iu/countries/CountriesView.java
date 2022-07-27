package com.iu.countries;

import java.util.ArrayList;

public class CountriesView {

	public void view(ArrayList<CountriesDTO> ar) {
		
		System.out.println("COUNTRY_ID \t COUNTRY_NAME \t REGION_ID");
		System.out.println("===============================================");
		for(CountriesDTO countriesDTO : ar) {
			System.out.print(countriesDTO.getCountry_id() + "\t");
			System.out.print(countriesDTO.getCountry_name() + "\t");
			System.out.println(countriesDTO.getRegion_id());
		}
		System.out.println("===============================================");
	}
}
