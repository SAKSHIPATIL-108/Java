import java.util.Scanner;

public class MsgDecoderApp {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch=scan.next().charAt(0);
		MsgDecoder md=new MsgDecoder();
		System.out.println(md.decodeCharacter(ch));
		scan.close();
	}

}
