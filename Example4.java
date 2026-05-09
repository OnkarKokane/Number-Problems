import java.util.Scanner;
class Example4{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);

	System.out.println("enter a number");
	int num=sc.nextInt();
	System.out.println("Entered numuber is  :"+num);

	int i=2;
	int sum=0;
	while(i<=num)
	{
	if(i%2==0){
		sum=sum+i;
	}

i++;
	}
	
	System.out.println(sum);
	}
}