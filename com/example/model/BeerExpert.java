package com.example.model;

import java.util.*;

public class BeerExpert {

	public List<String> getBrands(String color){
		List<String> brands = new ArrayList<String>();
		if(color.equals("amber")){
			brands.add("Jack Amber");
			brands.add("Red Moose");
			brands.add("Tuzlansko");
		} else{
			brands.add("Ale Pale");
			brands.add("Preminger");
			brands.add("Sarajevsko");
		}
		return brands;
	}
	
	public List<String> getNew(){
		List<String> newBrands = new ArrayList<>();
		newBrands.add("Gorstak");
		newBrands.add("Nektar");
		newBrands.add("Unski Biser");
 		return newBrands;
		
	}
}
