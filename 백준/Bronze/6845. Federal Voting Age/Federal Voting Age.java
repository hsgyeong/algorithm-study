import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			String answer = "";
			
			if(year<1989)
			{
				answer = "Yes";
			}
			else if(year==1989 && month==1 && day<=31)
			{
				answer = "Yes";
			}
			else if(year==1989 && month==2 && day<=27)
			{
				answer = "Yes";
			}
			else
				answer = "No";
			
			System.out.println(answer);
		}
	}

}
