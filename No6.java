public class No6 {
    public static void main(String[] args) {
	int a = 2;
	int b =15;
	boolean c = no6(a, b);
	System.out.println("I am in No 6 ");
	System.out.println("Value is = " + c);
    }
    public static boolean no6(int n1, int n) {
	if ((n==10 || n1==10) || (n+n1==10)){
	    return true;
	   }
	return false;
    }
}

