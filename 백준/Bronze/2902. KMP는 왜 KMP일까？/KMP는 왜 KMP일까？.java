import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		String answer = "";
		
		for(int i=0; i<word.length(); i++)
		{
			char spell = word.charAt(i);
			
			if((int)spell>=65 && (int)spell<=90)
			{
				answer += spell;
			}
		}
		
		System.out.println(answer);
	}

}
