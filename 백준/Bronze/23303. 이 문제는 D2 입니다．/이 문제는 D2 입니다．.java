import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		String answer = "";
		
		for(int i=0; i<line.length();i++)
		{
			if(i+2<=line.length())
			{
				if(line.substring(i,i+2).equals("d2")||line.substring(i,i+2).equals("D2"))
				{
					answer = "D2";
					break;
				}
				else
					answer = "unrated";
			}	
		}
		
		System.out.println(answer);
	}

}
