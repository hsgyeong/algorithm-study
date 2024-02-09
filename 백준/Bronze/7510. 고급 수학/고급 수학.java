import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String answer = "";
		
		for(int i=0; i<n; i++)
		{
			int arr[] = new int[3];

			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<3; j++)
			{
				answer = "";
				
				arr[j] = Integer.parseInt(st.nextToken());
				
			}
			
			Arrays.sort(arr);
			
			if(((arr[0]*arr[0])+(arr[1]*arr[1]))==(arr[2]*arr[2]))
			{
				answer = "yes";
			}
			else
				answer = "no";
			
			bw.write("Scenario #"+(i+1)+":\n"+answer+"\n\n");
		}
			bw.flush();
			bw.close();
			br.close();
	}

}
