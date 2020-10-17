package methodReferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferencesExample {

	public static void main(String[] args) {
    
		Thread t = new Thread( () -> print() );
		t.start();
		
		//Method Reference () -> method()
		Thread t1 = new Thread(MethodReferencesExample:: print);
		t1.start();
		
		List<String> lang = new ArrayList<String>();
		lang.add("English");
		lang.add("Sanskrit");
		lang.add("Tamil");
		lang.add("Hindi");
		System.out.println("One argument method using lambda expression");
		performConditionaly(lang,l->true,l->System.out.println(l));  //Lambda Expression  (one argument) -> method(one argument)
		
		System.out.println("One argument method using Method references");
		performConditionaly(lang,l->true,System.out::println);  //Method references
	}
	
	private static void performConditionaly(List<String> lang,Predicate<String> predicate,Consumer<String> consumer) {
		for(String l:lang) {
			if(predicate.test(l)) {
				consumer.accept(l);
			}
		}
	}

	public static void print() {
		System.out.println("Hello");
	}

}
