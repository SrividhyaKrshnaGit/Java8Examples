package com.lamba.expression.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"Laptop",100000));
		productList.add(new Product(2,"LCD",50000));
		productList.add(new Product(3,"Phone",4000));
		productList.add(new Product(4,"Iphone",90000));
		productList.add(new Product(5,"Projector",5000));
		
		
	System.out.println("Printing Product using earlier method");
	
	List<Product> finalProducts = new ArrayList<Product>();
	for(Product p: productList) {
		if(p.getPrice()>25000) {
			finalProducts.add(p);
		}
	}
	
	for(Product p :finalProducts) {
		System.out.println(p);
	}
	
	System.out.println("***********************************************");
       productList.stream().filter(p->p.getPrice()>25000)
        					.collect(Collectors.toList())
        					.forEach(System.out::println);
       
		
	}

}
