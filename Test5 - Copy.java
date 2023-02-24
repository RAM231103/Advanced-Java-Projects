//interface demo
import java.util.Scanner;
interface Shape {
	
	public void setRadius(double d);
	public void area();
	public void volume();
}
class Circle implements Shape {
	double radius;
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void area() {
		System.out.println("Aea is "+3.14*radius*radius);
	}
	public void volume() { }
}
class Sphere implements Shape {
	double radius;
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void area() { }
	public void volume() {
		System.out.println("Volume is "+1.33*3.14*radius*radius*radius);
	}
}


public class Test5 {

	public static void main(String[] args) {
		int dimension;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 or 3");
		dimension = sc.nextInt();
		Shape s;
		if(dimension==2) {
			s = new Circle();
			s.setRadius(3.5);
			s.area();
		} else {
			s = new Sphere();
			s.setRadius(4);
			s.volume();
		}
	}

}
