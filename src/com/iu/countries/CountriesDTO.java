package com.iu.countries;

public class CountriesDTO {
	
	//멤버변수 선언
	//기본생성자
	//GETTER SETTER
	//멤버변수 명은 테이블명과 동일하게 
	//null값이 포함될 수 있으므로 데이터타입은 reference 타입으로 
	
	private String country_id;
	private String country_name;
	private Integer region_id;
	
	public CountriesDTO() {
		
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public Integer getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
	
	
	
	
	
	
}
