package day1;

public class Examplearrays {

	public static void main(String[] args) {
		int [] a={10,20,30,40,50};
		System.out.println(a[2]+" "+a[3]);
		// enhance for
		for(int temp: a){
			System.out.println(temp + "....................");
		}
		int [] x = new int[5];
		x[3]=25;
		x[2] = 12;
		for(int temp2 : x){
			System.out.println("temp2....." + temp2);
		}
		String [] st = {"one", "two", "three"};
		for(String temp: st){
			System.out.println(temp);
		}
		
		

	}

}
