import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		HashSet<Integer> arr = new HashSet<>();
		int answer = 0;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++)
		{
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
	
		st = new StringTokenizer(br.readLine());
		
		for(int j=0; j<M; j++)
		{
			if(arr.contains(Integer.parseInt(st.nextToken())))
			{
				answer = 1;
			}
			else
				answer = 0;
			
			bw.write(Integer.toString(answer)+" ");
		}
	
			bw.flush();
			bw.close();
			br.close();
	}

}
