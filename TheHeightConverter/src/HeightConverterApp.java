import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Height of the person in inches");
		double inches=scan.nextDouble();
		HeightConverter hc=new HeightConverter();
		System.out.printf("%.2f",hc.convertInchesToFeet(inches));
	}
}
