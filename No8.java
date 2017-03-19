public class No8 {
    public static void main(String[] args) {
	int a = 2;
	int b = -4;
	//boolean negative = true;
	boolean c = no8(a, b);
	System.out.println("I am in No 8 ");
	System.out.println("Value is = " + c);
    }
    public static boolean no8(int n, int n1) {
	boolean negative = true;
	if (negative){
	    return (n < 0 && n1 < 0);
		}
	return ((n <0 && n1 > 0) || (n > 0 && n1 < 0));
	    /*
	if (((n <0 && n1 > 0) || (n > 0 && n1 < 0)) && (n < 0 && n1 < 0)){
	    return true;
	   }
	   return false; */
    }
}

