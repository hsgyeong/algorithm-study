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
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int num = 0;
		int answer = 0;
		
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			String OX = st.nextToken();
			int count = 0;
			num = 0;
			
			for(int j=OX.length(); j>0; j--) 
			{	
				if(OX.substring(j-1, j).equals("O"))
				{
					count++;
				}	
			}
			
			if(count>M/2)
			{
				num++;
			}
			
			answer += num;
		}
		
		bw.write(Integer.toString(answer));
		
			bw.flush();
			bw.close();
			br.close();
	}

}
