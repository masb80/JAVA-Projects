package demoVaskaranSarcar;

import java.util.*;

public class JavaLessonSix {
	static Scanner userInput = new Scanner(System.in); 

	public static void main(String[] args) {
		System.out.println("How old are you" );
		int age =checkValidAge();
		if(age!=0){
			System.out.println("You are  " + age + "  years old");
		}
		

	}
	public static int checkValidAge(){
		try
		{
			return userInput.nextInt();
		}
		catch(InputMismatchException e){
		userInput.next();
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		}
		System.out.println("That isn't a whole number");
		
		return 0;
	}

}
