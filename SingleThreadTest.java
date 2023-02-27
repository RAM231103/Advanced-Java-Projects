//it creates single thread to print 1 to 5
//total 2 threads (main,one)

class MyThread extends Thread {
	String name;
	MyThread(String threadname) {
		name = threadname;
		System.out.println(name + " thread created");
	}
	public void run() {
		try {
		for(int i=1;i<=5;i++) {
		System.out.println(name+" "+i);
		Thread.sleep(1000);
	    } 
	    }catch(Exception e) {}
  }
}
public class SingleThreadTest {

	public static void main(String[] args) throws Exception{
		System.out.println("Main thread begings");
		System.out.println("Hello");
        //context switch to thread one
		MyThread m1 = new MyThread("One");
		MyThread m2 = new MyThread("Two");
		MyThread m3 = new MyThread("Three");
		MyThread m4 = new MyThread("Four");
		MyThread m5 = new MyThread("Five");
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		Thread.sleep(10000);
		System.out.println("Byeeeeeeeee");
	}

}
