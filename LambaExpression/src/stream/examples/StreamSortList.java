package stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortList {

	public static void main(String[] args) {
      List<String> fruits = Arrays.asList("Mango","Apple","Orange","Kiwi","Gauva");
      fruits.stream().sorted().forEach(f->System.out.println(f));
      List<String> fruitSorted = fruits.stream().sorted().collect(Collectors.toList());
      System.out.println(fruitSorted);
      
      System.out.println(fruits.stream()
    		  .sorted(Comparator.reverseOrder())
    		  .collect(Collectors.toList()));
      
      System.out.println("USing Comaprator opertor ");
      List<String> sortedFruits = fruits.stream().sorted((f1,f2)-> f1.compareToIgnoreCase(f2))
    		  .collect(Collectors.toList());
      List<String> sortedFruits1 = fruits.stream().sorted((f1,f2)-> f2.compareToIgnoreCase(f1))
    		  .collect(Collectors.toList());
      System.out.println(sortedFruits1);
      
      List<Product> productList = new ArrayList<Product>();
      productList.add(new Product(1,"Voilin",4000));
      productList.add(new Product(2,"Flute",9000));
      productList.add(new Product(3,"Venna",6000));
      productList.add(new Product(4,"Guitar",8000));
      List<Product> productSortedPrice = productList.stream().sorted((p1,p2) -> (p1.getPrice() -p2.getPrice()))
      .collect(Collectors.toList());
      System.out.println(productSortedPrice);
      
      List<Product> productSortedName = productList.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
      System.out.println(productSortedName);
	}

}
