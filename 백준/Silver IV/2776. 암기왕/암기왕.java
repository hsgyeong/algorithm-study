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
		
		int T = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		
		for(int i=0; i<T; i++)
		{

			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			HashSet<Integer> aArr = new HashSet<>();
			
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<a; j++)
			{
				int Anum = Integer.parseInt(st.nextToken());
				aArr.add(Anum);
			}
			
			st = new StringTokenizer(br.readLine());
			
			int b = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			
			for(int k=0; k<b; k++)
			{	
				int Bnum = Integer.parseInt(st.nextToken());
				
				if(aArr.contains(Bnum))
				{
					answer = 1;
				}
				else
				{
					answer = 0;
				}
			
				bw.write(Integer.toString(answer)+"\n");
			}
		}
			bw.flush();
			bw.close();
			br.close();
	}
}
