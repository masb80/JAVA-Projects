package day1;

public class Example2darray {

	public static void main(String[] args) {
		int[][] td=new int[4][3];
		int temp = 10;
		for(int i=0; i<4;i++){
			for(int j=0; j<3;j++){
				td[i][j]=temp;			
			temp+=10;				
			}
		}
		for(int i=0; i<4;i++){
			for(int j=0; j<3;j++){				
			System.out.print(td[i][j]+" "); // results not as a line
			}
			System.out.println();	// for new line

	}

	}
}
