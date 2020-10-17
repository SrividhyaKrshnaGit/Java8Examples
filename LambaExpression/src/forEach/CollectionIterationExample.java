package forEach;

import java.util.Arrays;
import java.util.List;

import functionalInterface.People;

public class CollectionIterationExample {

	public static void main(String[] args) {
    
		List<People> peopleList = Arrays.asList(
				new People("Sri","Vidhya",20),
				new People("Padma","Sri",18),
				new People("Sri","Krshna",16),
				new People("Krshna","Priya",24)
				);
		System.out.println("External Iteration: Controlled by us Sequentially : for loop");
		
		for(int i=0; i<peopleList.size(); i++) {
			System.out.println(peopleList.get(i));
		}
		
		System.out.println("External Iteration: Controlled by us Sequentially : for each loop");
		for(People p : peopleList) {
			System.out.println(p);
		}
		
		System.out.println("Internal iternal controlled by runtime : for each Lambda ");
		//For each lambda
		peopleList.forEach(p-> System.out.println(p));
		
		System.out.println("Using METHOD REFERENCES");
		//Using same with Method Reference
		peopleList.forEach(System.out::println);
		
		
}

}
