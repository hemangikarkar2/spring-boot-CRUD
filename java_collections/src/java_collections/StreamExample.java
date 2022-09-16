package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/**Stream API is used to process collections of objects.
 *  A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
 */
public class StreamExample {
	  public static void main(String[] args) {
		    
		    ArrayList<Integer> l1=new ArrayList<>();
		    l1.add(1);
		    l1.add(2);
		    l1.add(3);
		    l1.add(4);
		    l1.add(5);
		    l1.add(6);
		    l1.add(7);
		    
		    l1.forEach(i->System.out.println(i));
		    
		    ArrayList<Integer> list = new ArrayList<Integer>();

		 

		    for(int i=0;i<=100;i++)
		    {
		        list.add(i);

		 

		    }
		    list.forEach(z->System.out.println(z));
		    Stream<Integer> stream = l1.stream();

		 

		    
		    /*IntStream stream1 = IntStream.range(100, 200);  
		    System.out.println(""+stream1);
		    */
		    
		    List<Integer> ret = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());  
		    System.out.println(""+ret);

		 

		    IntStream.range(5600,5603).forEach(i->System.out.println(i));//using stream you can also use System.out::println in for each    
		//    IntStream.range(5600,5603).forEach(System.out :: println);
		    
		    IntStream.range(55,59).forEach(i->System.out.println(i));

		 

		    //Now if we wan to convert this stream into string of numbers separated by comma what should be done
		    IntStream.rangeClosed(55,59).forEach(i->System.out.println(i));
		    System.out.println(
		            IntStream.range(56, 89).boxed().map(String::valueOf)
		                   .collect(Collectors.joining(","))
		    );
		    
		    
		    System.out.println("1) map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.\n");
		    List number = Arrays.asList(2,3,4,5);
		    System.out.println("number :" +number);
		    List square = (List) number.stream().map(x -> number).collect(Collectors.toList());
		    System.out.println("square" +square);
		
		    
		    
		    System.out.println("2) filter: The filter method is used to select elements as per the Predicate passed as argument.");
		    List names = Arrays.asList("Reflection","Collection","Stream");
		    List result = (List) names.stream().filter(s->((String) s).startsWith("C")).collect(Collectors.toList());
		    System.out.println("result ::"+result);
		   
		   System.out.println("3) sorted: The sorted method is used to sort the stream");
		   List names2 = Arrays.asList("Reflection","Collection","Stream");
		   List result2 = (List) names2.stream().sorted().collect(Collectors.toList());
		   System.out.println("result2" +result2);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		/*    String str=i.stream().collect(Collectors.joining(","));
		*/    /*Stream<Integer> randomNumbers = Stream
		            .generate(() -> (new Random()).nextInt(100));

		 

		        randomNumbers.limit(20)
		             .forEach(System.out::println);
		*/    }
	  
	  
}
