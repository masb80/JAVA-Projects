public class No10 {
    public static void main(String[] args) {
	//String abul = "sonia";
	//int n1= 5;
	String c = no10("not abul",5);
	System.out.println("I am in No 10 ");
	System.out.println("Value is = " + c);
    }
    public static String no10(String str, int n){
	String front = str.substring(0,n);
	String back = str.substring(n+1, str.length());
    
	return front + back;
	
    }
}

