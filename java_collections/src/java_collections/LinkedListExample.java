package java_collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LinkedListExample {

	public static void main(String args[]){
	
	LinkedList l = new LinkedList();
	l.add("hello");
	l.add('l');
	l.add(100);
	l.add('E');
	System.out.println("list are  : "+l);

	l.set(3, "java");
	
	System.out.println(l.get(3));
	System.out.println("after changing the value : "+l);
	
	System.out.println(l.contains("c++"));
	System.out.println(l.contains("java"));
	
	System.out.println(l.isEmpty());
	
/*	System.out.println("using for loop");
	//for loop 
	for(int i=0; i<l.size();i++){
		System.out.println(l.get(i));
	}
	*/
/*	System.out.println("using for each");
	//for each
	for(Object element : l ){
		System.out.println(" " +element);
	}
	*/
	Iterator it = l.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
	LinkedList new_list = new LinkedList<>();
	new_list.add("x");
	new_list.add("P");
	new_list.add("A");
	new_list.add("Z");
	
	new_list.addAll(l);
	System.out.println(" new linkedlist :"+new_list);
	
	new_list.removeAll(l);
	System.out.println("after remvoing all l"+new_list);
	
	Collections.sort(new_list);
	System.out.println("after sorting :"+new_list);
	
	//reverse order
	Collections.sort(new_list,Collections.reverseOrder());
	System.out.println("Reverse order :"+new_list);

	
	l.addFirst("tiger");
	l.addLast("elephent");
	System.out.println("List are :" +l);
	
	System.out.println("first element in the list is : "+l.getFirst());
	System.out.println("last element in the list is : "+l.getLast());
	
	l.removeLast();
	l.removeLast();
	
	System.out.println("after remove first and last element :: "+l);
	}

}


