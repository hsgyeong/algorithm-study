import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int JOI = 0;
		int IOI = 0;
		
		for(int i=0; i<word.length(); i++)
		{
			if(i+3<=word.length())
			{
				if(word.substring(i,i+3).equals("JOI"))
				{
					JOI++;
				}
				else if(word.substring(i,i+3).equals("IOI"))
				{
					IOI++;
				}
			}	
		}
		
		System.out.println(JOI+"\n"+IOI);
	}

}
