package assignments;

public class Employee {

    double hoursWork;
    double basePay;
    double subtotal;
    double totalPay;
    double minimumWage ;
    double lowerHoursLimit;
    double upperHoursLimit;
    void calculateTotalPay(){
    	if(hoursWork <= 40){
    		if(minimumWage> basePay){   		
    			totalPay = hoursWork*basePay;
    			System.out.println("Total Pay of Employee = " + totalPay);
    			}else{
    				System.out.println("Error: Base wage is less than mimimum wage");
    			}
    		}else if(hoursWork <= 60){
    			subtotal = basePay*1.5;
    			totalPay = hoursWork*subtotal;
    			System.out.println("Total Pay of Employee = " + totalPay);   		
    		}else{
    			System.out.println("Error:Eployee worked more than 60 hours");
    		}
   		 
    	}
    	}

