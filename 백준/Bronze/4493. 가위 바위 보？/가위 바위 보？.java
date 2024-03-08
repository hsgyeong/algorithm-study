import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++)
		{
			int n = sc.nextInt();
			int Ascore = 0;
			int Bscore = 0;
			String answer = "";
			
			for(int j=0; j<n; j++)
			{
				String a = sc.next();
				String b = sc.next();
				
				if(a.equals("R") && b.equals("P")
					||a.equals("S") && b.equals("R")
					||a.equals("P") && b.equals("S"))
				{
					Bscore++;
				}
				else if(b.equals("R") && a.equals("P")
					||b.equals("S") && a.equals("R")
					||b.equals("P") && a.equals("S"))
				{
					Ascore++;
				}
			}
			
			if(Ascore>Bscore)
			{
				answer = "Player 1";
			}
			else if(Ascore==Bscore)
			{
				answer = "TIE";
			}
			else
				answer = "Player 2";
			
			System.out.println(answer);
		}
	}

}
