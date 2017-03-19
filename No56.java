public class No56 {
    public static void main(String[] args) {
	int nc = 20;
	boolean s  = true; 
	//String a  = "weekday"; 
	boolean c = no56(s, nc);
	System.out.println("I am in No 56 ");
	System.out.println("Result is = " + c);
    }
    public static boolean no56(boolean weekday, int nc){
	//boolean weekday = true;
	if (weekday){
	    if((40 <= nc) && (nc <= 60) )
		 return true; 
	    } else
	    if(40 <= nc){
	    }		
	    	return false;
    }
	
}

