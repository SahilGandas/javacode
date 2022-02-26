package recursion;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		//System.out.println("enter the term till you want to print the fibonacci series.");
		Scanner s1=new Scanner(System.in);
		fibonacci f=new fibonacci();
		f.fib(0, 7);
		
	}
	void fib(int i,int n)
	{
		if(i>n)
			return ;
		  int c=i+(i+1);
		  System.out.println(c);
		  fib(i+1, n);
	}

}
