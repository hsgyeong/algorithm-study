import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String name[] = new String[n];
		String answer = "";
		
		for(int i=0; i<n; i++)
		{
			name[i] = sc.next();
		}
		
		loop:
			
		for(int j=0; j<n; j++)
		{
			for(int k=0; k<name[j].length(); k++)
			{
				if(name[j].substring(k,k+1).equals("S"))
				{
					answer = name[j];
					break loop;
				}
			}
		}
		
		System.out.println(answer);
	}

}
