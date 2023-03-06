//Print numbers 5 to 1 three times using Runnable
class printTask implements Runnable {
	public void run() {
		try {
			for(int i=5;i>=1;i--) {
				System.out.println(Thread.currentThread()+" "+i);
			}
		}catch(Exception e) {}
	}
}
public class Test12 {

	public static void main(String[] args) throws Exception{
	printTask task = new printTask();
	Thread t1 = new Thread(task);
	Thread t2 = new Thread(task);
	Thread t3 = new Thread(task);
	t1.start();
	t2.start();
	t3.start();
	t1.setName("first");
	t2.setName("second");
	t3.setName("thrid");
	t1.join();
	t2.join();
	t3.join();
	System.out.println("Main ends");

	}

}
