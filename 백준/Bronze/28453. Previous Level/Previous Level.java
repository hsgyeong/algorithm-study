import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int level = 0;
		int answer = 0;
		
		for(int i=0; i<n; i++)
		{
			level = sc.nextInt();
			
			if(level==300)
			{
				answer = 1;
			}
			else if(level<300 && level>=275)
			{
				answer = 2;
			}
			else if(level<275 && level>=250)
			{
				answer = 3;
			}
			else if(level<250)
			{
				answer = 4;
			}

			System.out.print(answer+" ");
		}

	}

}
