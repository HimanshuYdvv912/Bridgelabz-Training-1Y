import java.util.Scanner;
class Bonus{
	public static void main(String...args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Salary:");
		double salary=input.nextDouble();
		int years=input.nextInt();
		if(years>5){
			double bonus=salary*0.5;
			System.out.println("Bonus:"+bonus);
		}
		else 
		{
			System.out.println("No bonus")
		}
	}
}