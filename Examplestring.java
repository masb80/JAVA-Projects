package day1;

public class Examplestring {

	public static void main(String[] args) {
		String x = "James Dean";
		System.out.println("Hello" + x);
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2,7));
		
		String age = "37";
		String salary = "738";
		//wrapper classes
		int a = Integer.parseInt(age)+2;
		double s = Double.parseDouble(salary)*0.15;
		System.out.println(s);
		System.out.println(a);
				

	}

}
