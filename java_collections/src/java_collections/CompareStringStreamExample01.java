package java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java_collections.model.CompareUser01;
import java_collections.model.CompareUser02;


//Compare two string list and check weather they are same or not ?
public class CompareStringStreamExample01 {

	public static void main(String[] args) {

		List<CompareUser01> list1 = Arrays
				.asList(
				new CompareUser01(01,"hema","hkarkar@gmail.com"),
				new CompareUser01(02,"rekha","rekha12@gmail.com"),
				new CompareUser01(03,"roopa","roopa@gmail.com"),
			//	new CompareUser01(04,"hema","hkarkar@gmail.com"),
				new CompareUser01(05,"chahna","ch123@gmail.com")
			);
		
		List<CompareUser02> list2 = Arrays.asList(
				new CompareUser02(01,"hema","hkarkar@gmail.com"),
				new CompareUser02(02,"rekha","rekha12@gmail.com"),
				new CompareUser02(03,"roopa","roopa@gmail.com"),
				new CompareUser02(05,"chahna","ch123@gmail.com"));
		

		
		
		
	/*	List<String> mappedList = list1.stream().
                map(emp -> emp.getName()).
                collect(Collectors.toList());
		mappedList.forEach(System.out::println);
		*/
	//	List<CompareUser01> user = list1.stream().filter(listUser -> listUser.getEmail()).collect(Collectors.toList());
		
		/*	List<CompareUser01> result = list1.stream()
									.filter(p1 ->list2.stream())
									.anyMatch(p2 ->p2.equals(p1.getEmail())
									 .collect(Collectors.toList());
		*/								    		
									    	

		
		
		/*		Boolean b = list1.containsAll(list2) && list2.containsAll(list1);

			System.out.println(b);
		 */
	
	
	
		/*boolean allEqual = list1.stream().distinct().limit(2).count() <= 1;
		
		System.out.println(allEqual);
		 */
	
		
	
		
		/*	List<String> result = list1.stream().filter(e -> (list2.stream().filter(d -> d.equals(e)).count()) < 1)	
				.collect(Collectors.toList());
		 
		
		if(result.size()== 0)
		{
			System.out.println("not same");
		}
		else{
			System.out.println("same");
		}
		*/
	
		//Boolean result= list2.stream().anyMatch(list1::contains);
			//.anyMatch(x ->x.equals(list2.stream()));
		//System.out.println(result);
	
		/*Predicate<String> notIn2 =( s -> ! list2.stream().anyMatch(c -> s.equals(c.str)));
		List<String> list3 = list1.stream().filter(notIn2).collect(Collectors.toList());
		*/
		
		
		/*boolean result = list1.stream().allMatch(list  -> list.equals(list2));
		System.out.println(result);
			if(result){
				System.out.println("stream is  same");
			}
			else{
				System.out.println("stream is not same");
			}*/
		/*for(CompareUser01 compareUser01 :list1){
		for(CompareUser02  compareUser02 : list2){
			if((compareUser01.getEmail()).equals(compareUser02.getEmail())){
			//	list1.forEach(System.out::println);
				System.out.println("user same" );
			}
			else{
				System.out.println("not same");
			}
		}
	}
	 */
	}



}
