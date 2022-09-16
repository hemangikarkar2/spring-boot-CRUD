package java_collections;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import sun.net.www.content.audio.x_aiff;


public class CompareListExample02 {


	private static final Predicate<? super String> String = null;

	public static void main(String[] args) {

		
		List<String> listA = Arrays.asList("a", "b", "b", "c");
		//List<String> listB = Arrays.asList("a", "b", "b", "c");
		List<String> listB = Arrays.asList("b", "c", "a", "b");
		
	//System.out.println("listA =ListB :" +listA.equals(listB));
		
		List<String> list1 = new ArrayList<>();
        list1.add("Hemangi");
        list1.add("Pooja");
        list1.add("Riya");
        list1.add("Reema");
       
        List<String> list2 = new ArrayList<>();
        list2.add("Hemangi");
        list2.add("Pooja");
        list2.add("Riya");
        list2.add("Reema");
        list2.add("Reema2");
       
    //	System.out.println("listA =ListB :" +list1.equals(list2));
		
  
    	/*List<String> list3 = (List<java.lang.String>) list1.stream()
    		    .filter(item -> !list2.contains(item))
    			//list1.stream().filter(x ->(list2).equals(list2.stream()))
         .collect(Collectors.toList()) ;
  
    	System.out.println(list3);
    	 list3.forEach(System.out :: println);
       */
    	 List<String> l3 =list1.stream().filter(x -> list2.contains(x)).collect(Collectors.toList());
    	 System.out.println(l3);
        
    	 List<String> listOutput = list1.stream().filter(e -> e.contains("Hema")).collect(Collectors.toList());
         System.out.println(listOutput);
         
         /* if(list3 != null) {
            System.out.println("String one is equal to two i.e. one == two");
         }else{
            System.out.println("String one is not equal to String two i.e. one!=two");
         }
        */
   // Boolean result= list2.stream().anyMatch(list1::contains);
            //.anyMatch(x ->x.equals(list2.stream()));
        //System.out.println(result);
//   / List<String,String> list3 = list1.stream().filter(String x ->list2.stream()).anyMatch(y ->y.equals(list1));

   
    }
		
	}
	



