import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String arr[] = new String[st.countTokens()];
		
		for(int i=0; i<arr.length; i++)
		{	
			arr[i] = st.nextToken();
		}	
		
		String A = br.readLine();
		int length = A.length();
		int count = 0;
		
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j].length()>=A.length())
			{
				if(!A.equals(arr[j]) && A.equals(arr[j].substring(0,length)))
				{
					count++;
				}
			}	
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
