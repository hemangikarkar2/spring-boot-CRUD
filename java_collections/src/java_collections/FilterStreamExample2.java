package java_collections;

import java.util.ArrayList;
import java.util.List;

import java_collections.model.User;

public class FilterStreamExample2 {

	
	public static void main(String[] args) {
		
		List<User>  list  = new ArrayList<>();
		
		for(User user :list)
		{
		System.out.println(user);	
		}
		
	 	getUsers().stream().filter((user) -> user.isStatus()).forEach(System.out::println);
	 			 
	}
		private static List<User> getUsers(){
		
		List<User> p= new ArrayList<User>();
		{
		//List<User> p = new ArrayList<User>();
		// Predicate<User> isUserActive = e -> e.getStatus() == User. ;
		p.add(new User(1, "Hemangi", "Karkar", true));
		p.add(new User(2, "Pooja", "bhatt", false));
		p.add(new User(3, "ishani", "patel", true));
		p.add(new User(4, "riya", "ramani", false));
		p.add(new User(5, "chahna", "patel", true));
		p.add(new User(6, "pratiksha", "makwana", true));
		return p;
		}
	
	
	}
}


