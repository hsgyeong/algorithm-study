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
		
		for(int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine());
			String arr[] = new String[st.countTokens()];
			String sum = "";
			String answer = "";
			
			for(int j=0; j<arr.length; j++)
			{
				arr[j] = st.nextToken();
			}
			
			arr[0] = "god";	
			
			for(int k=1; k<arr.length; k++)
			{	
				sum += arr[k];
			}
			
			answer = arr[0]+sum;
			
			bw.write(answer+"\n");
		}
			bw.flush();
			bw.close();
			br.close();
	}

}
