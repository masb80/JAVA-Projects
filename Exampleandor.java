package day1;

public class Exampleandor {

	public static void main(String[] args) {
		int x,y;
		x=10;
		y=-10;
		if(x>0 && y>0){
			System.out.println("both are positive");
		}else if(x>0 || y<0){
			System.out.println("one is positive");
		}else {
			System.out.println("other condition");
		}

	}

}
