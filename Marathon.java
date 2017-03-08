package assignments;

//import java.util.Scanner;

public class Marathon {	
		public static void main(String[] args) {
			String[] names = {
					"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
					"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
					"Aaron", "Kate"
				};
				int[] times = {
						341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
						343, 317, 265
				};				
				 int largest = times[0];
				 int secondHighest = times[0];
				 	String title = "times";	
				 	String title1 = "times";	
				 	
				 	for (int j = 1; j < times.length; j++){
				 		if(times[j] > largest){
				 			 secondHighest = largest;
				 			largest = times[j];	
				 			title = names[j];
						 }else if (times[j] > secondHighest){
						        // Just replace the second highest
						        secondHighest = times[j];
				 		        title1 = names[j];
						 }					
				 		}		
					
				 	System.out.println("Fastest runner is, " +title + ": " + largest + " Minutes");
				 	System.out.println("Second runner up is, " + title1 + ": " + secondHighest + " Minutes");
			}	
		
		}	
	