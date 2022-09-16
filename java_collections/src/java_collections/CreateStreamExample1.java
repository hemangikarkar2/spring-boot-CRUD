 package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import java_collections.model.User;


public class CreateStreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//create a stream 
		Stream<String> s1 =Stream.of("a","b","c");
		s1.forEach(System.out :: println);
		
		//resource a stream 
		Collection<String> c =Arrays.asList("java","J2EE","c++","Python");
		Stream<String> s2 =c.stream();
		s2.forEach(System.out :: println);
		
		List<String> ls = Arrays.asList("java","J2EE","c++","Python");
		Stream<String> s3 =c.stream();
		s3.forEach(System.out :: println);
	
		Set<String> set =new HashSet<>(ls);
		Stream<String> s4 =set.stream();
		s4.forEach(System.out :: println);
		
		List<User> p = new ArrayList<User>();
		// Predicate<User> isUserActive = e -> e.getStatus() == User. ;
		p.add(new User(1, "Hemangi", "Karkar", true));
		p.add(new User(2, "Pooja", "bhatt", false));
		p.add(new User(3, "ishani", "patel", true));
		p.add(new User(4, "riya", "ramani", false));
		p.add(new User(5, "chahna", "patel", true));
		p.add(new User(6, "pratiksha", "makwana", true));
		
		
		
	}

}
