import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		String word1 = "";
		String word2 = "";
		String answer = "";
		
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++)
		{
			answer = "";
			
			st = new StringTokenizer(br.readLine());
			
			word1 = st.nextToken();
			word2 = st.nextToken();
			
			String word1Arr[] = new String[word1.length()];
			String word2Arr[] = new String[word2.length()];
			
			for(int j=0; j<word1.length(); j++)
			{
				word1Arr[j] = word1.substring(j,j+1);
			}
			
			for(int k=0; k<word2.length(); k++)
			{
				word2Arr[k] = word2.substring(k,k+1);
			}
			
			Arrays.sort(word1Arr);
			Arrays.sort(word2Arr);
			
			if(word1.length()!=word2.length())
			{
				answer = word1+" & "+word2+" are NOT anagrams.";
			}
			else if(word1.length()==word2.length())
			{
				for(int l=0; l<word1Arr.length; l++)
				{
					if(!word1Arr[l].equals(word2Arr[l]))
					{
						answer = word1+" & "+word2+" are NOT anagrams.";
						break;
					}
					else
						answer = word1+" & "+word2+" are anagrams.";
				}
			}
			System.out.println(answer);
	}
			bw.flush();
			bw.close();
			br.close();
			
	}

}
