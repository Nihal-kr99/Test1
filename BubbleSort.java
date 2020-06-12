import java.util.*;
class BubbleSort
{
	public static void main(String[] args)
	{
		int i,j,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers of element you want to sort");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements");
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		
		for(i=0;i<n-1;i++)
		{
			boolean sorted=true;
			for(j=0;j<n-1-i;j++)
			{
				if(a[j+1]>a[j])
				{
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted=false;
				}
			}
			if(sorted) break;
		}
		
		for(int item:a)
		{
			System.out.println("Sorted elements are" +item);
		}
	}
}