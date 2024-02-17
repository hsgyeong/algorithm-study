import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		String answer = "";
		
		for(int i=0; i<N; i++)
		{
			int length = sc.nextInt();
			
			if(length<=W || length<=H || (length*length)<=(W*W)+(H*H))
			{
				answer = "YES";
			}
			else 
				answer = "NO";
			
			System.out.println(answer);
		}
	}

}
