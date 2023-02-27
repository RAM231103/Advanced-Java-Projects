//program on unchecked exception
//ex (ArithematicException, nullpointer, Arrayindexoutofbounds)
public class Test6 {

	public static void main(String[] args) {
		System.out.println("Program begins");
		int x = 5;
		int y = 0;
		int z = x/y;  //run time mistake
		System.out.println("End of the program");

	}

}
