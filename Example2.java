import java.util.Scanner;

class Example2{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);

	System.out.println("enter a number");
	int num=sc.nextInt();
	System.out.println("entered number is");

	int i=num;

	while(i>=1){
	System.out.println(i);
	i--;
	}
	}
}