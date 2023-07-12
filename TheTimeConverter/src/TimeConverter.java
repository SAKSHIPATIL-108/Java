import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter time in minutes");
		int minutes=scan.nextInt();
		System.out.printf("%.1f",convertToHours(minutes));
		scan.close();

	}
	public static double convertToHours(int minutes)
	{
		return (double)minutes / 60.0;
	}

}
