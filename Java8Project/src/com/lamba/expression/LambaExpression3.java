package com.lamba.expression;

import java.util.ArrayList;
import java.util.List;

interface Addable{
	
int add(int a,int b); 
	
}

public class LambaExpression3 {

	public static void main(String[] args) {

		Addable addable = (a,b) -> {
			System.out.println("Inside Lamba Expression");
			return a+b;//use retun stament when there is more than one statement
		};
		System.out.println(addable.add(10, 20));
		
		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("C");
		languages.add("C++");
		languages.add("Javascript");
		System.out.println("Use forEach using Lambda Expression");
		languages.forEach(l ->System.out.println(l));
		
	}

}
