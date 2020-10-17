package com.lamba.expression.method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lamba.expression.comparator.sort.Employee;

public class MethodReferenceExample1 {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(
				new Employee(1,"Sri",24,50000),
				new Employee(2,"Vidhya",44,66000),
				new Employee(3,"Padma",14,56000),
				new Employee(4,"Krshna",54,87000),
				new Employee(5,"KrishnaPriya",33,70000)
				);
		
		System.out.println("Functional interface example using lamba Expression");
		functionalInterfaceMethod(employeeList,e->true,e-> System.out.println(e));
		
		System.out.println("Same rewritten in Method reference that is  e-> System.out.println(e) is equivalent to System.out::println");
		functionalInterfaceMethod(employeeList,e->true,System.out::println);
	}
	
	
	public static void functionalInterfaceMethod(List<Employee> employee,Predicate<Employee> predicate,Consumer<Employee> consumer) {
		
		for(Employee e:employee) {
			if(predicate.test(e)) {
				consumer.accept(e);
			}
		}
	}

}
