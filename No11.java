public class No11 {
    public static void main(String[] args) {
      String c = no11("not abul");
	System.out.println("I am in No 11 ");
	System.out.println("Value is = " + c);
    }
    public static String no11(String str){
      if (str.length() <= 1) return str;
      
      String mid = str.substring(1, str.length()-1);
      return str.charAt(str.length()-1) + mid +str.charAt(0);
    }
}

