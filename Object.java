import java.util.Scanner;
public class Object {
	String name;
	String id;
	int age;

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Object st1 = new Object();
	Object st2 = new Object();
	Object st3 = new Object();
	
	System.out.println("Enter Nmae:");	
	st1.name = input.next();	
	System.out.println("Enter ID");
	st1.id = input.next();
	System.out.println("Enter Age");
	st1.age = input.nextInt();
	
	System.out.println("Enter Nmae:");
	
	st2.name = input.next();
	
	System.out.println("Enter ID");
	st2.id = input.next();
	System.out.println("Enter Age");
	st2.age = input.nextInt();
	
	
	System.out.println("Enter Nmae:");
	
	st3.name = input.next();
	
	System.out.println("Enter ID");
	st3.id = input.next();
	System.out.println("Enter Age");
	st3.age = input.nextInt();
	System.out.println("Name of Object 1:  " + st1.name + ",    Id  " + st1.id + ",   Age " + st1.age);
	System.out.println("Name of Object 2:  " + st2.name + ",    Id  " + st2.id + ",   Age " + st2.age);
	System.out.println("Name of Object 3:  " + st3.name + ",    Id  " + st3.id + ",   Age " + st3.age);

	
	
	
	}

}
