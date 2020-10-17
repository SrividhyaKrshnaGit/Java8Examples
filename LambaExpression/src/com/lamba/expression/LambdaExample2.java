package com.lamba.expression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample2 {

	public static void main(String[] args) {
		
		List<String> langList = new ArrayList<String>();
		langList.add("C");
		langList.add("C#");
		langList.add("C++");
		langList.add("Java");
		
		langList.forEach(lang -> {
			
		System.out.println(lang);
		}
		);
		
	}

}
