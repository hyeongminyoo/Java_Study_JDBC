package com.iu.regions;

public class RegionsDTO {
	
	//멤버변수 접근지정자 : private
	//getter/setter
	//기본생성자 필수
	//멤버변수명은 DB Table의 컬럼명과 동일하게 선언
	
	private String region_name;
	private Integer region_id;
	
	public RegionsDTO() {
		
	}

	
	
	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public Integer getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
	

	

}
