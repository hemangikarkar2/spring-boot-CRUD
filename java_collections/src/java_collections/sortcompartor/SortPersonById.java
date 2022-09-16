package java_collections.sortcompartor;

import java.util.Comparator;

import java_collections.model.Person;

public class SortPersonById implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		
		return o1.getId().compareTo(o2.getId());
	}

}
