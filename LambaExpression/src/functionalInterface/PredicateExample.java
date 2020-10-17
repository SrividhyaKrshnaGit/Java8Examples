package functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		
		Predicate predicate = (person) ->  ((Person) person).getAge() > 30;
			boolean flag = predicate.test(new Person("Ram",39));
			System.out.println(flag);
		
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
	
}
