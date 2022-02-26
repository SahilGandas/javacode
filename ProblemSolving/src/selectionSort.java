import java.util.Scanner;

public class selectionSort {

	
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int ar[]= {5,6,3,2,4,1,};
	
	int k=0;
	for(int i=0;i<ar.length-1;i++)
	{
		int smallest=i;
		for(int j=i+1;j<ar.length;j++ )
		{
			if(ar[j]<ar[smallest])
				{
				smallest=j;
				}
			    
				
		}
		int temp=ar[i];
		ar[i]=ar[smallest];
		ar[smallest]=temp;
		

	}
	
	for(int k1=0;k1<ar.length;k1++)
		System.out.print(ar[k1]+ " ");
}
}
