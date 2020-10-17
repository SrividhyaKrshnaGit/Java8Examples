package forEach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListForEach {

	public static void main(String[] args) {
		
		List<String> cloudList = new ArrayList<String>();
		Set<String> webSet = new HashSet<String>();
		
		
		cloudList.add("AWS");
		cloudList.add("Azure");
		cloudList.add("Google");
		cloudList.add("Amazon");
		
		
		webSet.add("REST");
		webSet.add("SOAP");
		webSet.add("RESTFUL");
		
		for(String c: cloudList) {
			System.out.println(c);
		}
		
		//forEach
		
		cloudList.forEach(cloud -> {
			webSet.forEach(web -> {
				System.out.println("Inside foreach webset and cloud "+ web +" "+cloud);
			});
			
		});
		
		cloudList.stream().forEachOrdered(cloud -> System.out.println(" The stream forachOrdered "+cloud));
		
		webSet.stream().forEach(web -> System.out.println("THe web in stream are : "+web));
	}
	
}
