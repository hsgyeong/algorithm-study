import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String 	answer = "yes";
		
		String word [] = sentence.split(" ");
	
		outloop:
		
		for(int i=0; i<word.length; i++)
		{	
			String a = word[i];
			
			for(int j=i+1; j<word.length; j++)
			{
				String	b = word[j];
			
				if(a.equals(b))
				{	
					answer = "no";
					break outloop;
				}
			}
		}
			System.out.println(answer);
	}

}
