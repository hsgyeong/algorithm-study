import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			String answer = "Check";
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a+b+c==180)
			{
				answer = "Seems OK";
			}
			
			System.out.println(a+" "+b+" "+c+" "+answer);
		}
	}

}
