//create a thread using thread, give a name using 
//parameterized constructr
//print welcome and presidency

class Mynewth extends Thread {
	String name;
	Mynewth(String n) {
		name = n;
	}
	
	public void run() {
		try {
		System.out.println(name + "running");
		System.out.println("welcome");
		Thread.sleep(1000);
		System.out.println("presidency");
	} catch(Exception e) {}
}
}
public class Test10 {

	public static void main(String[] args) throws Exception {
		System.out.println("Hiiii");
		Mynewth t1 = new Mynewth("*First");
		t1.start();
		Mynewth t2 = new Mynewth("*Second");
		t2.start();
		Mynewth t3 = new Mynewth("*Third");
		t3.start();
		Mynewth t4 = new Mynewth("*Fourth");
		t4.start();
		Mynewth t5 = new Mynewth("*Five");
		t5.start();
		Thread.sleep(2000);
		System.out.println("Tatatatatatata");

	}

}
