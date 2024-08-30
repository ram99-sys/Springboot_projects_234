package in.raghu;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghu.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
	UserService service = context.getBean(UserService.class);	
	//service.getUserName(100);
	
	//Streams
	List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emily");
	names.stream()
	     .filter(name -> name.startsWith("A"))
	     .forEach(System.out::println);
	System.out.println("--------------");
	names.stream()
    .map(String::toUpperCase)
    .forEach(System.out::println);
	System.out.println("--------------");
	names.stream()
    .sorted()
    .forEach(System.out::println);
	System.out.println("--------------");
	//terminal operations
	names.stream()
	     .forEach(System.out::println);
	System.out.println("--------------");
	List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());
	System.out.println(filteredNames);
	System.out.println("--------------");
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	Optional<Integer> sum = numbers.stream()
	                               .reduce(Integer::sum);
	System.out.println(sum);
	long count = names.stream().count();
	System.out.println(count);
	System.out.println("--------------");
	int[] nums = {1, 2, 3, 4, 5};

    // Create a stream from the array
    IntStream streamFromArray = Arrays.stream(nums);

    // Print the elements of the stream
    streamFromArray.forEach(System.out::println);
    
    Stream<String> nameStream = Stream.of("Hello", "Everybody", "How", "Are", "You", "Doing");
    Stream<String> filteredStream= nameStream.filter((String name) -> name.length() <=3);
    List<String> finalList = filteredStream.collect(Collectors.toList());
    System.out.println(finalList);
    
    System.out.println("--------------");
    
    Stream<String> nameStream1 = Stream.of("HELLO", "Everybody", "HOW", "ARE", "YOU", "Doing");
    Stream<String> filteredStream1 = nameStream1.map((String name) -> name.toLowerCase());
    filteredStream1.forEach(System.out::println);
    
    List<List<String>> asList = Arrays.asList(Arrays.asList("Hello", "Everybody", "How", "Are", "You", "Doing"),
    		Arrays.asList("Java","is","object","oriented"),
    		Arrays.asList("Springboot","is","Application","Freamework"));
    Stream<String> flatMap = asList.stream().flatMap((List<String> word) -> word.stream());
    flatMap.forEach(System.out::println);
    
    System.out.println("--------------");
    List<List<String>> asList2 = Arrays.asList(Arrays.asList("Hello", "Everybody", "How", "Are", "You", "Doing"),
    		Arrays.asList("Java","is","object","oriented"),
    		Arrays.asList("Springboot","is","Application","Freamework"));
    Stream<String> flatMap2 = asList2.stream().flatMap((List<String> word) -> word.stream().map((String value) -> value.toLowerCase()));
    flatMap2.forEach(System.out::println);
    
    
    
    
    
    
    
    
    
    
    
	}

}
