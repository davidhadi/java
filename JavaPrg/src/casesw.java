import java.util.*;
class casesw{
	public static void main(String args[]){
		int x, n, m, result;
		float a, b;
	while(true){	
		Scanner sc = new Scanner(System.in);
		System.out.println("choose any option");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		x = sc.nextInt();
switch(x){
case 1 :
			 System.out.println("Enter number for addition : ");
			 n = sc.nextInt();
			 m = sc.nextInt();
			   result = m+n;
			 System.out.println("Result : "+result);
             break;
case 2 :
			 System.out.println("Enter number for subtraction : ");
			 n = sc.nextInt();
			 m = sc.nextInt();
			   result=n-m;
			 System.out.println("Result : "+result);
             break;	
case 3 :
			 System.out.println("Enter number for multiplication : ");
			 n = sc.nextInt();
			 m = sc.nextInt();
			    result = n*m;
			 System.out.println("Result : "+result);
             break;	
case 4 :
			 System.out.println("Enter number for divide : ");
			 a = sc.nextInt();
			 b = sc.nextInt();
			   float  resul = a/b;
			 System.out.println("Result : "+resul);
             break;	
default :   System.out.println("Error");
            } 
		}
	}
}