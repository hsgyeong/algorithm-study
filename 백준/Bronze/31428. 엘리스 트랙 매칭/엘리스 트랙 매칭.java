import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String info[] = new String[n];
		int count = 0;
		
		for(int i=0; i<n; i++)
		{		
			info[i] = sc.next();
		}
		
		String track = sc.next();
		
		for(int j=0; j<n; j++)
		{
			if(info[j].equals(track))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
