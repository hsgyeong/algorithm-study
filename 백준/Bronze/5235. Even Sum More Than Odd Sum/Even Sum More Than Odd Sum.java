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
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<T; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int EVEN = 0;
			int ODD = 0;
			String answer = "";
			
			for(int j=0; j<n; j++)
			{
				int num = Integer.parseInt(st.nextToken());
				
				if(num%2==0)
				{
					EVEN += num;
				}
				else if(num%2!=0)
				{
					ODD += num;
				}
			}
			
			if(EVEN>ODD)
			{
				answer = "EVEN";
			}
			else if(EVEN<ODD)
			{
				answer = "ODD";
			}
			else if(EVEN==ODD)
			{
				answer = "TIE";
			}
			
			bw.write(answer+"\n");
		
		}
			bw.flush();
			bw.close();
			br.close();
	}

}

