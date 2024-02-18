import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		String answer = "";
		
		while(true)
		{
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			if(x==0 && y==0)
			{	
				answer = "AXIS";
				System.out.println(answer);
				break;
			}
			
			if(x>0 && y>0)
			{
				answer = "Q1";
			}
			else if(x<0 && y<0)
			{
				answer = "Q3";
			}
			else if(x<0 && y>0)
			{
				answer = "Q2";
			}
			else if(x>0 && y<0)
			{
				answer = "Q4";
			}
			else if(x==0 || y==0)
			{
				answer = "AXIS";
			}
			
			System.out.println(answer);
		}
	}

}
