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
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			
			sum = 0;
			
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				
				sum += Integer.parseInt(st.nextToken());
			}
			
			bw.write(Integer.toString(sum)+"\n");

		}
		
		bw.flush();
		
		bw.close();
		br.close();
	}

}
