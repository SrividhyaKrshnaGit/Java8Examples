package functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise1 {

	public static void main(String[] args) {
    List<People> mylist= Arrays.asList(
    		new People("Sri","Vidhya",20),
    		new People("Padma","sri",18),
    		new People("Sri","Krshna",22),
    		new People("Padma","Bushan",20)
    		);
    
    Collections.sort(mylist, new Comparator<People>() {

	@Override
	public int compare(People o1, People o2) {
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}
	});
    
    System.out.println("Print all persons");
    for(People p: mylist) {
    	System.out.println(p);
    }
    
    System.out.println("Print all persons with last name beginning with B");
    
    printLastNameBeginningB(mylist,new Condition() {
		
		@Override
		public boolean test(People p) {
			return p.getLastName().startsWith("B");
		}
	});
   
}

	private static void printLastNameBeginningB(List<People> mylist,Condition condition) {
		for(People p: mylist) {
			if(condition.test(p)) {
	    	System.out.println(p);
			}
	    }		
	}
}

  interface Condition {
    boolean test(People p);
	}

