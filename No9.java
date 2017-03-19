public class No9 {
    public static void main(String[] args) {
	//String abul = "sonia";
	String c = no9("not abul");
	System.out.println("I am in No 9 ");
	System.out.println("Value is = " + c);
    }
    public static String no9(String str){
	if (str.length()>=3 && str.substring(0,3).equals("not")){
	    return str;
	}
	return "not" + str;
	
    }
}

