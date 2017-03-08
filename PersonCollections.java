//package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PersonCollections {
	
	private static final int SIZE = 20;
	
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>(SIZE);
		
		// Create a number of persons with random age.
		Random rand = new Random();
		
		for(int i = 1; i <= SIZE; ++i) {
			int randAge = rand.nextInt(50) + 1;
			persons.add(new Person("Person" + i, randAge));
		}
		
		// Print all persons before ordering them.
		for(int i = 0; i < SIZE; ++i)
			System.out.println(persons.get(i).toString());
		System.out.println();
		
		// Sort the collection based on the age of each person.
		Collections.sort(persons);
		
		// Print all persons after ordering them.
		for(int i = 0; i < SIZE; ++i)
			System.out.println(persons.get(i).toString());
		System.out.println();
	}
}
