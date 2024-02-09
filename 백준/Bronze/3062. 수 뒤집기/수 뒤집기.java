import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int reverseNum = 0;
		int rvSum = 0;
		String answer = "";
		
		for(int i=0; i<T; i++)
		{
			String n = br.readLine();
			String reverse = "";
			String reverseSum = "";
			
			int originalNum = Integer.parseInt(n);
			
			for(int j=n.length()-1; j>=0; j--)
			{
				reverse += n.charAt(j);
			
				//System.out.println(reverse);
			}
			
			reverseNum = Integer.parseInt(reverse);
			
			int sum = originalNum+reverseNum;
			
			String stringSum = Integer.toString(sum);
			
			for(int k=stringSum.length()-1; k>=0; k--)
			{
				reverseSum += stringSum.charAt(k);
			}
			
			if(stringSum.equals(reverseSum))
			{
				answer = "YES";
			}
			else 
			{
				answer = "NO";
			}
			
			bw.write(answer+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
