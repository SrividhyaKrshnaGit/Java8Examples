package com.lamba.expression.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamFindExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,2,1);
		Optional<Integer> element = list.stream().findFirst();
		if(element.isPresent()) {
			System.out.println(element.get());
		}else{
		 System.out.println("The element is not present");	
		}
		
		Optional<Integer> any = list.stream().findAny();
		if(any.isPresent()) {
			System.out.println(any.get());
		}else{
		 System.out.println("The element is not present");	
		}
		
		System.out.println("Stream count " +list.stream().count());
		System.out.println("Stream min value " +list.stream().min(Comparator.comparing(Integer::valueOf)).get());
		System.out.println("Stream max value " +list.stream().max(Comparator.comparing(Integer::valueOf)).get());
		}

}
