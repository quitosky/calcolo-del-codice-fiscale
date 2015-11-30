package com.springcodicefiscale.database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class DbManager {
	public List<String> getRegionList(){
		Session session = Service.getSessionFactory().openSession();
		session.beginTransaction();

		String hql = "from Country";
		List<String>country=new ArrayList<String>();
		Query query = session.createQuery(hql);
		
		List<Country> results = query.list();
		for (Country aCategory : results) {
//			System.out.println(aCategory.getRegion());
			country.add(aCategory.getRegions());
		}
		session.getTransaction().commit();
		
		for (int i = 0 ; i < country.size() ; i++){
	        String currObj=(String) country.get(i);
	        for (int k=i+1 ; k< country.size() ; k++){
	            String tmpObj=(String)country.get(k);
	            if (currObj.equals(tmpObj)){
	            	country.remove(k);
	            	
	                      k--;
	                    }
	        }
	    }
		Collections.sort(country);
		return country;
		
	}
	public List<String> getProvinceList(String state){
		Session session = Service.getSessionFactory().openSession();
		session.beginTransaction();

		String hql = "from Country where regione= :selecReg";
		Query query = session.createQuery(hql);
		query.setString("selecReg", state);
		List<String>country=new ArrayList<String>();
		
		
		List<Country> results = query.list();
		for (Country aCategory : results) {
//			System.out.println(aCategory.getRegion());
			country.add(aCategory.getProvinces());
		}
		session.getTransaction().commit();
		
		for (int i = 0 ; i < country.size() ; i++){
	        String currObj=(String) country.get(i);
	        for (int k=i+1 ; k< country.size() ; k++){
	            String tmpObj=(String)country.get(k);
	            if (currObj.equals(tmpObj)){
	            	country.remove(k);
	            	
	                      k--;
	                    }
	        }
	    }
		Collections.sort(country);
		return country;
		
	}
	public List<String> getCountryList(String state){
		Session session = Service.getSessionFactory().openSession();
		session.beginTransaction();

		String hql = "from Country where prov= :selecProv";
		Query query = session.createQuery(hql);
		query.setString("selecProv", state);
		List<String>country=new ArrayList<String>();
		
		
		List<Country> results = query.list();
		for (Country aCategory : results) {
//			System.out.println(aCategory.getRegion());
			country.add(aCategory.getCountries());
		}
		session.getTransaction().commit();
		
		for (int i = 0 ; i < country.size() ; i++){
	        String currObj=(String) country.get(i);
	        for (int k=i+1 ; k< country.size() ; k++){
	            String tmpObj=(String)country.get(k);
	            if (currObj.equals(tmpObj)){
	            	country.remove(k);
	            	
	                      k--;
	                    }
	        }
	    }
		Collections.sort(country);
		return country;
		
	}
	
	public String getCode(String country){
		Session session = Service.getSessionFactory().openSession();
		session.beginTransaction();

		String hql = "from Country where paese= :selecProv";
		Query query = session.createQuery(hql);
		query.setString("selecProv", country);
		
		String code = "";
		List<Country> results = query.list();
		for (Country aCategory : results) {
//			System.out.println(aCategory.getRegion());
			code=(aCategory.getCode());
		}
		session.getTransaction().commit();
		return code;
	}
}
