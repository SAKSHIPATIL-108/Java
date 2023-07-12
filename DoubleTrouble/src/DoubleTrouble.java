import java.util.*;
public class DoubleTrouble {

	public static void main(String[] args) 
	{
		//int res=doubleTheNumber(15);
		//System.out.println(res);	
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}

}
