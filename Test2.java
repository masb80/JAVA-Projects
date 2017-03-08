package demoVaskaranSarcar;

class A2{
	int a;
	int b;
	A2(int a, int b){
		System.out.println("I am in parent constructor");
		this.a=a;
		this.b=b;
	}


void parentMethod(){
	System.out.println("I am in parent method");
		
	}	
}	

class B2 extends  A2{
	int c;
	B2(int a, int b, int c){
		super(a,b);			
			System.out.println("I am in child constructor");
			this.c=c;
		}
	void childMethod(){
		System.out.println("I am a child method");
		System.out.println("Now I am going to call parent method");
		super.parentMethod();
	}
	}
	

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("*** The use of supper keyword demo***");
		B2 obB2 = new B2(1,2,3);
		System.out.println("a in obB2" + obB2.a);
		System.out.println("b in obB2" + obB2.b);
		System.out.println("c in obB2" + obB2.c);
		obB2.childMethod();
	}

}
