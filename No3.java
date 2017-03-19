public class No3 {
public static void main(String[] args) {
      int a = 11;
      int b = 6;
      int c = minFunction(11, 6);
      System.out.println("Value is = " + c);
   }

   /** returns the minimum of two numbers */
   public static int minFunction(int n1, int n2) {
       //       int n1 = 11;
       //int n2=6;
        int min;
      if (n1 != n2)
         return n1+n2;
      else
	  return 2*(n1+n2);

      //return min; 
   }
}

