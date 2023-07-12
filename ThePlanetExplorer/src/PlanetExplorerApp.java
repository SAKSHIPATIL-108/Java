import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the sphere");
		double radius = scan.nextDouble()	;
		PlanetExplorer pe = new PlanetExplorer();
		System.out.printf("%.2f",pe.calculateSurfaceArea(radius));
	}
}
