
public class ArithmeticOperations {

	public static void main(String[] args) 
	{
		int subresult=subtractNumbers(20,5);
		System.out.println(subresult);
		int mulresult=multiplyNumbers(4,5);
		System.out.println(mulresult);
		double divresult=divideNumbers(20,4);
		System.out.printf("%.2f\n",divresult);
		int modresult=findRemainder(10,3);
		System.out.println(modresult);
	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}
}