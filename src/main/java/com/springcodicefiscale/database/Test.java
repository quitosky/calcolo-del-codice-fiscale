package com.springcodicefiscale.database;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;



public class Test {
	public static List<String> lista3;
	public DbManager db;
	public static void main(String[] args) {
//		Session session = Service.getSessionFactory().openSession();
//
//		session.beginTransaction();
//
//		String hql = "from Country where prov = :provincia";
//		List<String>country=new ArrayList<>();
//		Query query = session.createQuery(hql);
//		query.setString("provincia", "AG");
//		List<Country> results = query.list();
//		for (Country aCategory : results) {
//			System.out.println(aCategory.getCountry());
//			country.add(aCategory.getCountry());
//		}
//		session.getTransaction().commit();
//		Session session = Service.getSessionFactory().openSession();
//
		
		DbManager db =new DbManager();
		lista3=new ArrayList<String>();
		lista3=(db.getCountryList("me"));
		System.out.println(db.getCode("messina"));
		System.out.println(lista3.size());
	}

}
