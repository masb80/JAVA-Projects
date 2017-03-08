//package main.java;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetExample {
	
	private static final int SIZE = 20;
	
	public static void main(String[] args) {
		TreeSet<Person> persons = new TreeSet<Person>();

		// Create a number of persons with random age.
		Random rand = new Random();

		for (int i = 1; i <= SIZE; ++i) {
			int randAge = rand.nextInt(50) + 1;
			persons.add(new Person("Person" + i, randAge));
		}
		
		// Print all persons.
		Iterator<Person> iter = persons.iterator();
		while(iter.hasNext())
			System.out.println(iter.next().toString());
	}
}
