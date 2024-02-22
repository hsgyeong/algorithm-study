import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String word[] = new String [n];
		String reverse[] = new String[n];

		char spell = 0;
		double idx = 0;
		int length = 0;
		
		for(int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine());
			word[i] = st.nextToken();
		}
		
		for(int j=0; j<n; j++)
		{
			String reverseWord = "";
			
			for(int k=word[j].length()-1; k>=0; k--)
			{
				reverseWord += word[j].charAt(k);
				
				reverse[j] = reverseWord;
			}
		}
		
		for(int l=0; l<n; l++)
		{
			for(int m=0; m<n; m++)
			{
				if(word[l].equals(reverse[m]))
				{
					idx = Math.floor((double)word[l].length()/2);
					spell = word[l].charAt((int)idx);
					
					length = word[l].length();
					break;
				}
			}

		}

		bw.write(Integer.toString(length)+" "+String.valueOf(spell));	
		bw.flush();
		bw.close();
		br.close();
	}	
}
