public class No7 {
    public static void main(String[] args) {
	int a = 2;
	boolean c = no7(a);
	System.out.println("I am in No 7 ");
	System.out.println("Value is = " + c);
    }
    public static boolean no7(int n) {
	if ((n==10/100) || (n==10/200)){
	    return true;
	   }
	return false;
    }
}

