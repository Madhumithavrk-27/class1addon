package Thread;

public class ThreadClass implements Runnable {
	@Override//thread 1 starting
	 public void run() {
		 
		 try {
			 Thread.sleep(5000);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
//		 for(int i=30;i<40;i++) {
//			 System.out.println(i);
//		 }
			 

		 }
	 
}


