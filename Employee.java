package day2exercise;

public class Employee {

	public static void main(String[] args) {
		//Exercise1 alex, linda, john;
		//alex = new Exercise1();
		//linda = new Exercise1();
		//john = new Exercise1();
		
		Exercise1 alex = new Exercise1();
		Exercise1 linda = new Exercise1();
		Exercise1 john = new Exercise1();
		
		alex.salary = 900;
		alex.bonous=200;
		alex.calculateTotalPay();
		//System.out.println(totalpay);
		
		linda.salary = 1900;
		linda.bonous = 200;
		linda.calculateTotalPay();
		
		john.salary = 2900;
		john.bonous = 200;
		john.calculateTotalPay();

	}

}
