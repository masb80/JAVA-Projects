package assignments;



public class FooCorporation {

	public static void main(String[] args) {
						
		Employee  Employee1 = new Employee ();
		Employee  Employee2 = new Employee();
		Employee  Employee3 = new Employee();
		
		double minimumWage =8.0;
		double lowerHoursLimit = 40;
		double upperHoursLimit = 60;
		
		Employee1.hoursWork = 35;
		Employee1.basePay=7.50;
		Employee1.calculateTotalPay();
								
		Employee2.hoursWork = 47;
		Employee2.basePay = 8.0;
		Employee2.calculateTotalPay();
				
		Employee3.hoursWork = 73;
		Employee3.basePay = 10;
		Employee3.calculateTotalPay();


	}

}
