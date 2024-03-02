import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int k = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;
		
		for(int i=a; i<=b; i++)
		{
			if(k>=i)
			{
				if(k-i<=x)
				{
					count++;
				}
			}
			else if(k<i)
			{
				if(i-k<=x)
				{
					count++;
				}
			}
		}
		
		if(count==0)
			System.out.println("IMPOSSIBLE");
		else
			System.out.println(count);
	}

}
