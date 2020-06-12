import java.util.*;
class Array1
{
	public static void main(String[] args)
	{
		int n;
		int avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		n=sc.nextInt();
		int marks[]=new int[n];
		
		
		
		System.out.println("Enter students marks");
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			avg=avg+marks[i];
			
		}
		avg=avg/n;
		System.out.println("Average marks are=" +avg);
		System.out.println("This is demo");
		System.out.println("In dev branch");
		System.out.println("changes in dev branch");
	
		
		
	}
}