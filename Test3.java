package demoVaskaranSarcar;

class A3{
	int p;
	A3(){
		int p= 25;
	}
}

class B3 extends A3{
	int p;
	B3(){
		super.p=12;
		int p = 50;   // Problem ache, ashe na
	}
	void display(){
		System.out.println("p in parent class is  " + super.p);
		System.out.println("p in child class is   " + p);
	}
}


public class Test3 {

	public static void main(String[] args) {
		B3 obB3 = new B3();
		obB3.display();

	}

}
