import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String KIN = "KIN";
		
		for(int i=0; i<T; i++)
		{	
			int score[] = new int[5];
			
 			for(int j=0; j<5; j++)
 			{
 				score[j] = sc.nextInt();
 			}
 		
				Arrays.sort(score);
				
				if(score[3]-score[1]>=4)
				{
					System.out.println(KIN);
				}
				else
				{
					System.out.println(score[1]+score[2]+score[3]);
				}
		}
	}

}
