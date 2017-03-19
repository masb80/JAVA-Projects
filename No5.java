public class No5 {
    public static void main(String[] args) {
	int hour = 15;
	boolean talking = true;
	boolean c = no5(talking, hour);
	System.out.println("I am in No 5 ");
	System.out.println("Value is = " + c);
    }
    
    public static boolean no5(boolean talking, int n) {
	if (talking && (n > 20 || n < 7)){
	    return true;
	   }
	return false;
    }
}

