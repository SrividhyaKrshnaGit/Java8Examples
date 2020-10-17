package stream.examples;

import java.util.Arrays;
import java.util.List;

import functionalInterface.People;

public class StreamExample {
	public static void main(String[] args) {
		List<People> peopleList = Arrays.asList(
				new People("Sri","Vidhya",20),
				new People("Padma","Sri",18),
				new People("Sri","Padma",16),
				new People("Krshna","Priya",24)
				);
		peopleList.stream()
		.filter(p->p.getLastName().startsWith("P"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		
		System.out.println("Count of stream matching condition " +peopleList.stream()
		.filter(p->p.getLastName().startsWith("P"))
		.count());
	}

}
