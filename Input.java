
import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer");
		//double a = scan.nextDouble(); // for double or integer
		String a = scan.nextLine(); // for string
		System.out.println("Enter second integer");
		//double b = scan.nextDouble();
		String b = scan.nextLine();
		//double c = a+b;
		String c = a+b;
		System.out.println("a+b =  " + c);
		
  }
}
