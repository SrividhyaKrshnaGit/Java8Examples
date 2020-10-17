package functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FuntionalInterfacesExamples {

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
    performConditionally(mylist,p-> true,p->System.out.println(p));
    
    System.out.println("Print all persons with last name beginning with B");
    
    performConditionally(mylist,p->p.getLastName().startsWith("B"),p->System.out.println(p));
    
    System.out.println("Print all persons with First name beginning with P");
    
    performConditionally(mylist,p->p.getFirstName().startsWith("P"),p->System.out.println(p.getFirstName()));
}

	private static void performConditionally(List<People> mylist,Predicate<People> predicate,Consumer<People> consumer)
	{
		for(People p: mylist) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
	    }		
	}
}

