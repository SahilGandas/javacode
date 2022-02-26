package recursion;

import java.util.Scanner;

public class naturalSum {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of N");
		int n=s1.nextInt();
		System.out.println(nsum(n));
	}
	
	static int nsum(int n)
	{
		
		if(n==1)
			return 1;
		int sum=n+nsum(n-1);
		   return sum;
	}

}
