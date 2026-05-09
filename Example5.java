import java.util.Scanner;

class Example5{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);

	System.out.println("enter a number");
	int num=sc.nextInt();
	System.out.println("entered number is");

	int i=1;
	

	while(i<=num){
	if(!(i%2==0))
	System.out.println("odd is "+i);
	i++;
	while(i<=num){
	if((i%2==0))
	System.out.println("even is "+i);
	i++;
	}
	}
	}
}