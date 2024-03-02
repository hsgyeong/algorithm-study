import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String word = "";
		
		for(int i=0; i<n; i++)
		{
			word = sc.next();
			String answer = "no";
			
			if(word.length()>=6 && word.length()<=9)
			{
				answer = "yes";
			}
			
			System.out.println(answer);
		}
	}

}
