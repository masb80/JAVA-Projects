package day2exercise;

public class AreaCalculation {

	public static void main(String[] args) {
		Box ups = new Box();
		Box FedEx = new Box();
		
		ups.length = 39;
		ups.width = 3;
		ups.calculateArea();
				
		FedEx.length = 45;
		FedEx.width =60;
		FedEx.calculateArea();		

	}

}
