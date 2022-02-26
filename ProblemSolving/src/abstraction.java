interface Animal
{
	void walk();
}
class Horse implements Animal{
	public void walk(){
		System.out.println("Horse has 4 legs");
	}
}
class chicken implements Animal{
	public void walk()
	{
		System.out.println("Chicken has 2 legs");
	}
}
public class abstraction {
	public static void main(String[] args) {
		Horse h=new Horse();
        chicken h1 =new chicken();
		h.walk();
		h1.walk();
	}

}
