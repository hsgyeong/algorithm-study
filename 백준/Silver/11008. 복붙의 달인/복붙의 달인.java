import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			String word = sc.next();
			String part = sc.next();
			int count = 0;
			
			for(int j=0; j<word.length();)
			{
				if(j+part.length() <= word.length() && word.substring(j,j+part.length()).equals(part))
				{
					count++;
					j += part.length();
				}
				else
				{
					count++;
					j++;
				}
			}
			
				System.out.println(count);
		}
	}

}
