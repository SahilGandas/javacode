
public class compileTime {
	String name;
	int age;
	
	public void displayInfo(String name)
	{
		System.out.println(name);
	}
	
	public void displayInfo(int age)
	{
		System.out.println(age);
	}
	public static void main(String[] args) {
	  compileTime c1=new compileTime();
	  c1.displayInfo("sahil");
	  c1.displayInfo(23);
	  
	}

}
