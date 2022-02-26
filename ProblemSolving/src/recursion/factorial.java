package recursion;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		factorial f1=new factorial();
	   System.out.println("enter the number whose factoiral you want to find out ");
	   int x=s1.nextInt();
	   System.out.println(f1.fact(x));
	   
	}
	int fact(int n)
	{
		if(n==0)
			return 1;
		int fact=n*fact(n-1);
		    return fact;
	}

}
