package com.lamba.expression.comparator.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEmployeeSorting {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1,"Sri",24,50000));
		employeeList.add(new Employee(2,"Padma",14,45000));
		employeeList.add(new Employee(3,"Vidhya",34,55000));
		employeeList.add(new Employee(4,"Srividhya",27,40000));
		employeeList.add(new Employee(5,"Krshna",54,67000));
		Collections.sort(employeeList, new MySort());
		System.out.println("Sorting employee age using comparator implentation class \n"+ employeeList);
		
		//Implementing using Annonymous class
		System.out.println("Sorting salary using comparator Anynonmous class");
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary()) ;
				//return (int) (o1.getName().compareTo(o2.getName()));
			}
			
		});
		
       System.out.println(employeeList);
       System.out.println("Sorting salary using Lamba Expression in Comparator Implentation");
       Collections.sort(employeeList,(o1,o2) -> (int)(o1.getSalary()-o2.getSalary()));
       System.out.println(employeeList);
       System.out.println("Sorting name using Lamba Expresion in Comparator implementaion");
       Collections.sort(employeeList, (o1,o2)-> (int) (o1.getName().compareTo(o2.getName())));
       System.out.println(employeeList);
	}

}

class MySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge()-o2.getAge();//Ascending order
	}
	
}
