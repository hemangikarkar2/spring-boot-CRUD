package java_collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//Find Element Using Stream Api
public class FindElementUsingSteamExample5 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,3,7,2,2,3,2,1);
		//findFirst() and findAny()
		
		//findFirst() return first element of the stream
		Optional<Integer> element =list.stream().findFirst();
		if(element.isPresent()){
			System.out.println("findfirst :"+element.get());
		}else{
			System.out.println("Stream is empty");
		}
		//findany() return any element of the stream
		Optional<Integer> element2 =list.stream().findAny();
		if(element2.isPresent()){
			System.out.println(" findany :"+element.get());
		}else{
			System.out.println("Stream is empty");
		}
		
		Stream<Integer> Stream1= Stream.of(1,2,4,2,7,9,3,6,3,8);
		System.out.println("Count Elements == >"+Stream1.count());
	
		Integer integer = Stream.of(1,2,4,2,7,9,3,6,3,8).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min == > "+integer);
		
		Integer integer2 = Stream.of(1,2,4,2,7,9,3,6,3,8).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max == > "+integer2);
		
	}

}
