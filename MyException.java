package Thread;

public class MyException {

	public static void main(String[] args) {
		try{
		int a = 15;
		int b = 0;
		int c = a/b;
		System.out.println("Output" + c);
		} catch(Exception e){
			System.out.println("You go to stop here" + e);
		}

	}

}
