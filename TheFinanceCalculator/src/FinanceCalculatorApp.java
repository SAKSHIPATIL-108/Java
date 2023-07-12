import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the 3 real numbers");
		double principal=scan.nextDouble();
		double time=scan.nextDouble();
		double rate=scan.nextDouble();
		FinanceCalculator fc=new FinanceCalculator();
		System.out.printf("%.2f",fc.calculateSimpleInterest(principal,time,rate));
		scan.close();
	}

}
