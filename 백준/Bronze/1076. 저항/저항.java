import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String one = "";
		String two = "";
		
		long sum = 0;
		long x = 0;
		long answer = 0;
		
		String firstColor = sc.next();
		String secondColor = sc.next();
		String thirdColor = sc.next();
		
		if(firstColor.equals("black"))
		{
			one = "0";
		}
		else if(firstColor.equals("brown"))
		{
			one = "1";
		}
		else if(firstColor.equals("red"))
		{
			one = "2";
		}
		else if(firstColor.equals("orange"))
		{
			one = "3";
		}
		else if(firstColor.equals("yellow"))
		{
			one = "4";
		}
		else if(firstColor.equals("green"))
		{
			one = "5";
		}
		else if(firstColor.equals("blue"))
		{
			one = "6";
		}
		else if(firstColor.equals("violet"))
		{
			one = "7";
		}
		else if(firstColor.equals("grey"))
		{
			one = "8";
		}
		else if(firstColor.equals("white"))
		{
			one = "9";
		}
		
		if(secondColor.equals("black"))
		{
			two = "0";
		}
		else if(secondColor.equals("brown"))
		{
			two = "1";
		}
		else if(secondColor.equals("red"))
		{
			two = "2";
		}
		else if(secondColor.equals("orange"))
		{
			two = "3";
		}
		else if(secondColor.equals("yellow"))
		{
			two = "4";
		}
		else if(secondColor.equals("green"))
		{
			two = "5";
		}
		else if(secondColor.equals("blue"))
		{
			two = "6";
		}
		else if(secondColor.equals("violet"))
		{
			two = "7";
		}
		else if(secondColor.equals("grey"))
		{
			two = "8";
		}
		else if(secondColor.equals("white"))
		{
			two = "9";
		}
		
		if(thirdColor.equals("black"))
		{
			x = 1;
		}
		else if(thirdColor.equals("brown"))
		{
			x = 10;
		}
		else if(thirdColor.equals("red"))
		{
			x = 100;
		}
		else if(thirdColor.equals("orange"))
		{
			x = 1000;
		}
		else if(thirdColor.equals("yellow"))
		{
			x = 10000;
		}
		else if(thirdColor.equals("green"))
		{
			x = 100000;
		}
		else if(thirdColor.equals("blue"))
		{
			x = 1000000;
		}
		else if(thirdColor.equals("violet"))
		{
			x = 10000000;
		}
		else if(thirdColor.equals("grey"))
		{
			x = 100000000;
		}
		else if(thirdColor.equals("white"))
		{
			x = 1000000000;
		}
		
		sum = Long.parseLong(one+two);
		
		answer = sum * x;
		
		System.out.println(answer);
		
	}

}
