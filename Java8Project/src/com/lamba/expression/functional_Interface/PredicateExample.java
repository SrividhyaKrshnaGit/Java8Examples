package com.lamba.expression.functional_Interface;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Person> predicate = (person) -> person.getAge()>17;
		System.out.println(predicate.test(new Person("Sri",18)));
	}

}


class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}