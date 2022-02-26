class Shape{
	void area()
	{
		System.out.println("Prints the area of shape");
	}
	}
class Triangle extends Shape
{
	
 void area()
 {
	System.out.println("area of Trinagle is 1/2*b*h");
}
}
class Square extends Shape
{
	void area()
	{
		System.out.println("Area of the square is a*a");
	}
}

public class dynamicTime {
	public static void main(String[] args) {
		Shape s1=new Shape();
		Shape s2=new Triangle();
		s2.area();
	}

}
