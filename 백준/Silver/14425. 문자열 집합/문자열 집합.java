import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int count = 0;
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			
				st = new StringTokenizer(br.readLine());
				
				set.add(st.nextToken());
		}
		
		for(int j=0; j<M; j++) {
			
				st = new StringTokenizer(br.readLine()); 
				
				if(set.contains(st.nextToken())) {
						count++;
				}
		}
		
		bw.write(Integer.toString(count));		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
