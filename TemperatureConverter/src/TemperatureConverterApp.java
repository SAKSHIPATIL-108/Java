import java.util.Scanner;

public class TemperatureConverterApp 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureconverter=new TemperatureConverter();
		System.out.printf("%.2f",temperatureconverter.convertFahrenheitToCelsius(fahrenheit));
	}

}
