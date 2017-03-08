package Overriding;

public class BangladeshiPeople extends AsianPeople{
	public void speak(){
		System.out.println("I am in Bangladeshi people");
	   super.speak();
	   this.useThis();
	}
	public void useThis(){
		System.out.println("I am in this method");
	}

}
