import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ".");
			st.nextToken();
			String extension = st.nextToken();
				if(!map.containsKey(extension)) {
					list.add(extension);
				}		
			map.put(extension, map.getOrDefault(extension, 0)+1);
		}		
		Collections.sort(list);
		
		for(String ex:list) {
			sb.append(ex+" "+map.get(ex)+"\n");
		}
		System.out.println(sb);
	}
}


