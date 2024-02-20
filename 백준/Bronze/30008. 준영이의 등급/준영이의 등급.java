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
		int K = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<K; i++)
		{	
			int grade = Integer.parseInt(st.nextToken());
		
			int P = (grade*100)/N;
			
			if(0<=P && P<=4)
			{
				answer = 1;
			}
			else if(4<P && P<=11)
			{
				answer = 2;
			}
			else if(11<P && P<=23)
			{
				answer = 3;
			}
			else if(23<P && P<=40)
			{
				answer = 4;
			}
			else if(40<P && P<=60)
			{
				answer = 5;
			}
			else if(60<P && P<=77)
			{
				answer = 6;
			}
			else if(77<P && P<=89)
			{
				answer = 7;
			}
			else if(89<P && P<=96)
			{
				answer = 8;
			}
			else if(96<P && P<=100)
			{
				answer = 9;
			}
			
			bw.write(Integer.toString(answer)+" ");
		}
			bw.flush();
			bw.close();
			br.close();
	}

}
