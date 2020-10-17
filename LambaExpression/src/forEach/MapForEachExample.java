package forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExample {
	public static void main(String[] args) {
		
		StringLambda lambda = s->s.length();
		System.out.println("The lamba String Length "+lambda.print("Hello World"));
		
		
		Map<Integer,Person> personMap = new HashMap<Integer,Person>();
		personMap.put(1,new Person("Sri",19));
		personMap.put(2,new Person("Padma",16));
		personMap.put(3,new Person("Vidhya",22));
		personMap.put(4,new Person("Vidhu",18));
		
		//for each loop
		for(Entry<Integer,Person> p : personMap.entrySet()) {
			System.out.println(" Person key "+p.getKey());
			System.out.println(" Person value "+ p.getValue().getName());
			
		}
		
		// For each lambda
		personMap.forEach((key,value) -> {
			System.out.println(key);
			System.out.println(value.getName());
		});
	}

}

interface StringLambda{
	int print(String s);
}

class Person{
	
	String name;
	int age;
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
