import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		
		String sentence = br.readLine();
		String answer = "";
		int idx = 0;
		
		for(int i=1; i<=n; i++)
		{
			arr[idx++] = sentence.substring(i-1, i);
		}
		
		for(int j=n-5; j<n; j++)
		{
			answer = arr[j];
			
			bw.write(answer);
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
