import java.util.*;
class pattern2
{
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
  {
	System.out.println("Enter number : ");
	    int x=sc.nextInt();
		for(int i=0; i<x; i++)
		{
			System.out.println();
			for(int j=x-1; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			
		  System.out.println();
		}
  }
}
}