
public class TestMethod {

	public int a = 0; // attribute
	public int b = 0;
	public static void main(String[] args) {
	
		TestMethod tm1 = new TestMethod();
		TestMethod tm2 = new TestMethod();
		
		int a1 = tm1.inc(20,30);
		int a2 = tm2.inc(20,30);
		int a3 = tm1.inc(20,30);
		System.out.println(tm1.a +"   " +tm2.b);
    System.out.println("......" +a1);
	}
/*
	public void inc(int x, int y){ // tm1 and tm2 er modde ache
		//a+=50;// a= a+ 50;
		//b+=10; // b = b+10;
		a = a+x;
		b = b+y;
	}
	*/
	public int inc(int x, int y){
		a = a+x;
		b = b+y;
		int c = a*b;
		return c;
	}
	
}
