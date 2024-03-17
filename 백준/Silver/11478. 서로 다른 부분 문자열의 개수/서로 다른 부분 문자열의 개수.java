import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0; i<word.length();i++)
		{
			for(int j=0; j<word.length(); j++)
			{
				if(i+j<=word.length())
				{
					set.add(word.substring(i,i+j));
				}
			}
		}
		
		System.out.println(set.size());
	}

}
