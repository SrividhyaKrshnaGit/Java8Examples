package com.lamba.expression.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortExample {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Sapota");
		fruits.add("JackFruit");
		fruits.add("Grapes");
		
		fruits.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		List<String> finalFruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(finalFruits);
		List<String> finalCompareTo = fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(finalCompareTo);
		List<String> finalNoParam = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(finalNoParam);
		
		//descending Order
		List<String> finaldesc = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(finaldesc);
		List<String> finalDescCompareTo = fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(finalDescCompareTo);
		
		//
		
		System.out.println("Streaming Sorting the price of Product list in ascending order");
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"PC",255000));
		productList.add(new Product(2,"Monitor",30000));
		productList.add(new Product(3,"Mouse",2500));
		productList.add(new Product(4,"Laptop",200000));
		
		
		productList.stream().sorted((p1,p2) -> (int)(p1.getPrice()-p2.getPrice()))
		.collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("Comparator comparingDouble ");
		
		List<Product> comparatorProduct = productList.stream().sorted(Comparator.comparingDouble(Product::getPrice))
		.collect(Collectors.toList());
		System.out.println(comparatorProduct);//Ascending order
		
		System.out.println("Streaming Sorting the price of Product list in descending order");
		
		List<Product> comparatorProduct1 = productList.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed())
				.collect(Collectors.toList());
				System.out.println(comparatorProduct1);
		
				
	  System.out.println("Sorting the name in asceding order and descending order using ocmparator and Method reference");
		List<Product> productName = productList.stream().sorted(Comparator.comparing(Product::getName))
				.collect(Collectors.toList());
				System.out.println(productName);//Ascending order
	  List<Product> productName1 = productList.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed())
				.collect(Collectors.toList());
				System.out.println(productName1);
		
	}

}
