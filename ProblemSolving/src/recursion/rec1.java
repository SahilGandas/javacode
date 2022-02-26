package recursion;

public class rec1 {
	public static void main(String[] args) {
		rec1 r1=new rec1();
		r1.rec(5);
	}
		
	
	 
	void rec(int x)
	{
		{
			if(x==0)
				return;
		System.out.println(x);
		rec(x-1);
		
	  }

}
}
