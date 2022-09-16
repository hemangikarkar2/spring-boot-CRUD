package java_collections;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.jws.soap.SOAPBinding.Use;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import java_collections.model.User;

public class JavaStreamFilterObjects {

	public static void main(String[] args) {
		// List<String> p2 = Arrays.asList((1,"Hemangi","Karkar",true), )

		List<User> p = new ArrayList<User>();
		// Predicate<User> isUserActive = e -> e.getStatus() == User. ;
		p.add(new User(1, "Hemangi", "Karkar", true));
		p.add(new User(2, "Pooja", "bhatt", false));
		p.add(new User(3, "ishani", "patel", true));
		p.add(new User(4, "riya", "ramani", false));
		p.add(new User(5, "chahna", "patel", true));
		p.add(new User(6, "pratiksha", "makwana", true));

		// we will first stream the list
		// than we will filter user based on status
		// not we have stream of used based status filter
		// next we wanted to extract first name of the user from this current
		// stream
		// for that we can use map
		// not we will be having stream of string
		// and we will collect it last
		// assign this new list to variable
		
		List<String> activeUserFirstNames = p.stream().filter(listUser -> listUser.isStatus()).map(activeUser -> {
			return activeUser.getFirstName();
		}).collect(Collectors.toList());

		// now finallay print this

		System.out.println("active user list " + activeUserFirstNames);

		List<String> activeUserFirstNames2 = p.stream().filter(listUser -> listUser.isStatus()).map(User::getFirstName)
				.collect(Collectors.toList());

		/* 
		 * List<User> result = p.stream() .filter(person -> !person.getStatus())
		 * .collect(Collectors.toList());
		 * 
		 * result.forEach(p1 -> System.out.println(p1));
		 */

	
	}
}
