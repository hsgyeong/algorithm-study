import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idx = 0;

		while(true)
		{
			String answer = "same";
			
			String word1 = sc.next();
			String word2 = sc.next();
			
			String one[] = new String[word1.length()];
			String two[] = new String[word2.length()];
			
			idx++;
			
			if(word1.equals("END") && word2.equals("END"))
				break;
			
			if(word1.length() != word2.length())
			{
				answer = "different";
			}
			else 
			{	
				for(int i=0; i<word1.length(); i++)
				{
					one[i] = word1.substring(i,i+1);
					two[i] = word2.substring(i, i+1);
				}
				
				Arrays.sort(one);
				Arrays.sort(two);
				
				for(int j=0; j<word1.length(); j++)
				{
					if(!one[j].equals(two[j]))
					{
						answer = "different";
					}
				}
			}	
				System.out.println("Case "+idx+": "+answer);
		}
	}

}
