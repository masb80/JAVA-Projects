public class Bank
{
   public static void main(String [] args)
   {
      CheckingAccount c = new CheckingAccount(101);
      	 c.deposit(150.00);
	
      
      try
      {      
         c.withdraw(100.00);       
         c.withdraw(600.00);
      }catch(InsufficientFundsException e)
      {
         System.out.println("Sorry, but you are short $" + e.getAmount());
         e.printStackTrace();
      }
    }
}
