package Thread;

//public class ExampleThread {
public class ExampleThread implements Runnable {

	public static void main(String[] args) {
		/*
		Thread t1 = new Thread(){ // this Thread is not class name
		public void run(){
			for(int i =0; i<20; i++){
				System.out.println("Printing..." + 5*i);
				try{
					sleep(1000); // mili second
					
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		};
	
	t1.start();
	*/
		Thread t = new Thread(new ExampleThread());
		t.start();
	}

	@Override
	public void run() {
		for (int i=0; i<20; i++){
			System.out.println("Print...." + (5*i));
		}
		
	}
	

}
