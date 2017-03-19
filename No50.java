public class No50 {
    public static void main(String[] args) {
	String c = no50("Hi","bye");
	System.out.println("I am in No 50 ");
	System.out.println("Result is = " + c);
    }
    public static String no50(String str, String str1){
	
	    String a = str + str1;
	    String b = str1 + str;
	
      return a + b;     
      
      
    }
}

