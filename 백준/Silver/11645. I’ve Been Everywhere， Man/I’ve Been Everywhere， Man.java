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
		
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			
			HashSet<String> set = new HashSet<>();
			
			st = new StringTokenizer(br.readLine());
			
			int m = Integer.parseInt(st.nextToken());
			
			for(int j=0; j<m; j++) {
				
				st = new StringTokenizer(br.readLine());
				
				set.add(st.nextToken());
			}
			
			bw.write(Integer.toString(set.size())+"\n");
		}
			bw.flush();
			bw.close();
			br.close();
	}

}
