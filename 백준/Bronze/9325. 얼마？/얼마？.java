import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int optiontotal = 0;
		int answer = 0;
		int T = sc.nextInt();
	
			for(int i=0; i<T; i++)
			{
				int carprice = sc.nextInt();
				int n = sc.nextInt();
				optiontotal = 0;
				
			for(int j=0; j<n; j++)
			{
				int count = sc.nextInt();
				int optionprice = sc.nextInt();
				
				optiontotal += (count*optionprice);
			}
				answer = carprice+optiontotal;
			
				System.out.println(answer);
			}	
		}
	}
			

