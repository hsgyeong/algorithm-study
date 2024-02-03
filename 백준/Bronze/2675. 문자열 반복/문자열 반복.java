import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int idx = 0;
		char spell = 0;
		
		for(int i=0; i<T; i++)
		{
			int n = sc.nextInt();
			String word = sc.next();
			
			int arrSize = n*word.length();
			
			String arr[] = new String[arrSize]; 
			idx = 0;
			
			for(int j=0; j<word.length(); j++)
			{			
				for(int k=0; k<n; k++)
				{
					spell = word.charAt(j);
					
					arr[idx] = Character.toString(spell);
					idx++;
				}
			}
			
			for(int l=0; l<arrSize; l++)
			{	
				System.out.print(arr[l]);
			}
			System.out.println();
		}

	}
}
