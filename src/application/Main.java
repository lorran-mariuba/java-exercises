package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //update position 2 from list.
		
		System.out.println(list.size()); // See what size list have.
		
		//list.remove("Anna"); remove by name.
	    //list.remove(1); //remove by position.
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); //it's a predicate to use lambda.
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		 //when the list don't have element, it's showed negative number -1.
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		System.out.println("------------------------------------");
		
		//Create another list to get the result to lambda and converter to list again.
		/*.stream allow to use lambda, but, to use the new list, it's necessary to use collect 
		  to convert from lambda to list.*/
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------------------");
		// find the first element which start with for example A.
		// if don't have the letter in the first element, it'll show null.
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
