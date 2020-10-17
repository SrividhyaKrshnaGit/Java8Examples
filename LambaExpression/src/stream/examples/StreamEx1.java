package stream.examples;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
      
		Stream<String> stream1 =Stream.of("a","b","c","d");
		stream1.forEach(System.out::println);
		
		Collection<String> collection = Arrays.asList("java","c++","c","Java");
		collection.stream().forEach(System.out::println);
		
		List<String> os = Arrays.asList("Windows","Linux","Mac");
		//os.stream().forEach(System.out::println);
		os.stream().forEach(s->System.out.println(s));
		
		
		List<Product> productList = Arrays.asList(
				new Product(1,"HP",4000),
				new Product(2,"MAC",9000),
				new Product(3,"DELL",2000)
				);
		
		productList.stream().filter(p-> p.getPrice() > 2000).collect(Collectors.toList()).forEach(System.out::println);
	}

}
