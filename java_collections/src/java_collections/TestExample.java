package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java_collections.model.Employee;
import java_collections.model.Person;
import java_collections.sortcompartor.SortPersonById;

public class TestExample  {

	public static void main(String[] args) {
		/* comparable Example	*/
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1004,"pooja",7000.00));
		empList.add(new Employee(1005,"rekha",7500.00));
		empList.add(new Employee(1001,"Hemangi",9000.00));
		empList.add (new Employee(1002,"Chahna",8500.00));
		empList.add(new Employee(1003,"Pratiksha",9000.00));
		
		System.out.println("Before Sorting :: ");
		empList.forEach(System.out :: println);
		
		System.out.println("After Sorting empList based on ID");
		Collections.sort(empList);
		empList.forEach(System.out :: println);
	
	
		/* comparator Example	*/
		List<Person> pList = new ArrayList<>();
		pList.add(new Person(1004,"pooja"));
		pList.add(new Person(1005,"rekha"));
		pList.add(new Person(1001,"Hemangi"));
		pList.add(new Person(1003,"Pratiksha"));
		
		System.out.println("Before Sorting :: ");
		pList.forEach(System.out :: println);
		
		System.out.println("After Sorting PersonList based on ID");
		Collections.sort(pList, new SortPersonById());;
		pList.forEach(System.out :: println);
	
	
	} 
	
}

