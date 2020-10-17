package com.lamba.expression.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {

		
		//Create Stream 
		Stream stream =Stream.of("a","b","c");
		stream.forEach(System.out::println);
		
		Collection collection = Arrays.asList("Green","Orange","Red","White");
		collection.stream().forEach(System.out::println);
		List<String> list = Arrays.asList("C#","C++","Java","Javascript");
		list.stream().forEach(System.out::println);
		Set<String> set = new HashSet<String>(list);
		set.stream().forEach(System.out::println);
		
		String[] array = {"Apple","Orange","Fig"};
		Arrays.stream(array).forEach(System.out::println);
		
		
	}

}
