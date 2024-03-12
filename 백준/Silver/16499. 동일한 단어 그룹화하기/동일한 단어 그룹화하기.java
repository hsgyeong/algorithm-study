import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String word = "";
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0; i<n; i++)
		{
			word = sc.next();
			String arr[] = new String[word.length()];
			
			String word2 = "";
			
			for(int j=0; j<word.length(); j++)
			{
				arr[j] = word.substring(j,j+1);
			}
			
			Arrays.sort(arr);
			
			for(int k=arr.length-1; k>=0; k--)
			{
				word2 += arr[k];
			}
			
			set.add(word2);
		}
			System.out.println(set.size());
	}

}
