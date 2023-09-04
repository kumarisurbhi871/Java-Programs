package surbhi;
interface Shape111 {
	   abstract double getArea();
	   abstract double getPerimeter();
}

class Circle111 implements Shape111 {
	   private double radius;

	   public Circle111(double radius) {
	      this.radius = radius;
	   }

	   public double getArea() {
	      return 3.14* radius * radius;
	   }

	   public double getPerimeter() {
	      return 2 * 3.14 * radius;
	   }
	}

public class abstractionpure {

	public static void main(String[] args) {
		Circle111 c1= new Circle111(4);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());

	}

}
