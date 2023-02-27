//program on checked exception (serious)
//ex (FileNotFoundException, InterruptedException,SQLException)
//for checked exception try-catch is mandatory
//throws is an alternate solution for try catch for ignoring exception
public class Test7 {

	public static void main(String[] args) throws Exception{
		try {
		System.out.println("Program Begins");
		//throw new ArithmeticException("Division by zero");
		throw new InterruptedException("Thread Interruption");
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	    

}
}
