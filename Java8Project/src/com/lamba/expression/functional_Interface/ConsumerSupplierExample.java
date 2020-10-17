package com.lamba.expression.functional_Interface;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplierExample {

	public static void main(String[] args) {
      Consumer<Person> consumer = (person) -> System.out.println(person);
      consumer.accept(new Person("Srividhya",20));
      Supplier<Person> supplier = ()-> new Person("Sri",23);
      System.out.println(supplier.get());
	}

}
