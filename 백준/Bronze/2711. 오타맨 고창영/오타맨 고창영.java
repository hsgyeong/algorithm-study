import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int n = 0;
		String word = "";
		StringBuffer answer;
		
		for(int i=0; i<T; i++)
		{
			n = sc.nextInt();
			word = sc.next();
			
			answer = new StringBuffer(word).deleteCharAt(n-1);
			
			System.out.println(answer);
		}
	}

}
