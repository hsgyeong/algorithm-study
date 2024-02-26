import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String answer = "";
		
		for(int i=0; i<n; i++)
		{
			answer = "";
			
			double a = sc.nextInt();
			double b = sc.nextInt(); 
			double c = sc.nextInt();
			
			if(a+b==c || a-b == c || b-a == c || a*b == c || a/b == c || b/a == c)
			{
				answer = "Possible";
			}else 
				answer = "Impossible";
			
			System.out.println(answer);
		}
	}
}
