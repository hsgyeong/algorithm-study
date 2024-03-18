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
		
		HashSet<String> set = new HashSet<>();
		
		String answer = "";

		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++)
		{
			String cheese = st.nextToken();
			
			if(cheese.length()>=6 && cheese.substring(cheese.length()-6,cheese.length()).equals("Cheese"))
			{
				set.add(cheese);
			}
		}
		
		if(set.size()>=4)
		{
			answer = "yummy";
		}
		else
			answer = "sad";
		
		bw.write(answer);
		bw.flush();
		bw.close();
		br.close();
	}

}
