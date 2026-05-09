import java.util.Scanner;
class Example8{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("enter a number");
	int num=sc.nextInt();
	System.out.println("entered number is"+num);

	int i=1;
	int x=num;
	int sum=0;

	while(i<=10){

		sum=x*i;
		System.out.println(num+"*"+i+"="+sum);
		i++;


	}
	}
}