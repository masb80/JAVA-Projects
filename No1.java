public class No1
{
    public static void main(String[] args) {
	boolean weekday = true;
	boolean vacation = true;
	boolean answer = sleepIn(weekday,weekday);
	System.out.println("I am in No 1");		
	 System.out.println("answer " + answer);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
	//	boolean weekday, vacation;
	return (!weekday || vacation);

    }
    
}
