import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int zero = 0;
		int one = 0;
		String answer = "";
		
		for(int i=0; i<3; i++)
		{
			one = 0;
			zero = 0;
			
			for(int j=0; j<4; j++)
			{
				int n = sc.nextInt();
			
				if(n==1)
				{
					one ++;
				}
				else if(n==0)
				{
					zero ++;
				}
			}

			if(zero==1 && one==3)
			{
				answer = "A";
			}
			else if(zero==2 && one==2)
			{
				answer = "B";
			}
			else if(zero==3 && one==1)
			{
				answer = "C";
			}
			else if(zero==4 && one==0)
			{
				answer = "D";
			}
			else 
				
				answer = "E";
			
			System.out.println(answer);
	}

}
}	
