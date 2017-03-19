public class No4 {
    public static void main(String[] args) {
	int n = 11;
	double c = no4(n);
	System.out.println("Value is = " + c);
    }
    
   public static double no4(int n) {
       if (n > 21){
	   double a = 2.0*Math.abs((n-21));
	   return a;
       }
       else
	   return Math.abs(n-21);
       
       //return min; 
   }
}

