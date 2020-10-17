package functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExerciseJava8 {

	public static void main(String[] args) {
    List<People> mylist= Arrays.asList(
    		new People("Sri","Vidhya",20),
    		new People("Padma","sri",18),
    		new People("Vidhya","Krshna",22),
    		new People("Padma","Bushan",20)
    		);
    //Sort the collections 
    
    Collections.sort(mylist, (o1,o2)->  o1.getLastName().compareToIgnoreCase(o2.getLastName()));
    
    System.out.println("Print all persons");
    printConditionally(mylist,p-> true);
    
    System.out.println("Print all persons with last name beginning with B");
    
    printConditionally(mylist,(p)->p.getLastName().startsWith("B"));
    
    System.out.println("Print all persons with First name beginning with P");
    
    printConditionally(mylist,p->p.getFirstName().startsWith("P"));
}

	private static void printConditionally(List<People> mylist,Condition condition) {
		for(People p: mylist) {
			if(condition.test(p)) {
	    	System.out.println(p);
			}
	    }		
	}
}

