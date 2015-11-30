package com.springcodicefiscale.database;

import java.io.Serializable;

public class Country implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String regions,provinces,countries,code;
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Country() {
		
	}
	public Country(int id,String regions, String provinces, String countries, String code) {
		super();
		this.id = id;
		this.regions = regions;
		this.provinces = provinces;
		this.countries = countries;
		this.code = code;
	}
	public String getRegions() {
		return regions;
	}
	public void setRegions(String regions) {
		this.regions = regions;
	}
	public String getProvinces() {
		return provinces;
	}
	public void setProvinces(String provinces) {
		this.provinces = provinces;
	}
	public String getCountries() {
		return countries;
	}
	public void setCountries(String countries) {
		this.countries = countries;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
