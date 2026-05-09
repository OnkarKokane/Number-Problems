import java.util.Scanner;

class Example6{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("enter a number");
	int num=sc.nextInt();
	System.out.println("entered number is"+num);

	int i=1;
	int sum=0;
   while(i<=num){
   // System.out.print(i);
   sum=sum+i;
     // System.out.println("sun is :::"+sum);
   i++;
   }
   System.out.println("sum is :"+sum);
	}
}