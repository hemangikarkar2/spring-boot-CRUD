package java_collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class StreamSortingListExample3 {

	public static void main(String args[]){
	List<String> user1 = new ArrayList<String>();
	user1.add("Hema");
	user1.add("rekha");
	user1.add("jaya");
	user1.add("shushma");
	user1.add("Hema");
	List<String> sortedList = user1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(sortedList);
	
	List<String> sortedList2 = user1.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
	System.out.println(sortedList2);
	
	List<String> sortedList3 = user1.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedList3);
	
	//descending order
	
	
	
	
	}
}

