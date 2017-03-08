

public class TestMethod2 {

	public static int a = 0; // attribute
	public static int b = 0;
	public static void main(String[] args) {
	
		TestMethod2 tm1 = new TestMethod2();
	tm1.cal(2.2f, 2.3F);
	int r =rem(2,3); // static hower karone object deya hoy nai
	System.out.println("Rem" + r);
	}
	
	public void cal(float a, float b){
		System.out.println("Sum of "+ "a"+ "b" + sum(a,b));
		System.out.println("Sub of "+ "a"+ "b" + sub(a,b));
		System.out.println("mul of "+ "a"+ "b" + mul(a,b));
		System.out.println("div of "+ "a"+ "b" + div(a,b));
	}
	
	
		public float sum(float a, float b){
			
		return a+b;
	}
	public float sub(float a, float b){
		return a-b;
	}
	public float mul(float a, float b){
		return a*b;
	}
	public float div(float a, float b){
		return a/b;
	}
	public static int rem(int x, int y){
		a =5; // static hower karone declare kora lagbe na
		b = 7;
		return a%b; //static means single copy
		// object create na korei call kora jabe
	}
}
