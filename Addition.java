import java.util.*;

class Addition
{
	 public static void main (String[] args)
 {
 	Scanner sc=new Scanner(System.in);
 	int a,b,c,ch;
 	while(true)
 	{
 	
 	System.out.println("Enter first number");
 	a=sc.nextInt();
 	System.out.println("Enter second number");
 	b=sc.nextInt();
 	System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
 	
 	System.out.println("Enter your choice:");
 	ch=sc.nextInt();
 	
 	switch(ch)
 	{
 		case 1:	c=a+b;
 	System.out.println("Addition is= " +c);
 	break;
 	
 	case 2: c=a-b;
 	System.out.println("Substraction is=" +c);
 	break;
 	
 	case 3: c=a*b;
 	System.out.println("Multiplication is=" +c);
 	break;
 	
 	case 4: c=a/b;
 	System.out.println("Division is=" +c);
 	break;
 	
 	case 5: System.exit(1);
 	
 	default: System.out.println("Ivalid input.......!!!!");
 	
 	}	
 	
 	}
 }
	
	
}