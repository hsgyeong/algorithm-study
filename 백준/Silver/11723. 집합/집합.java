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
		int x = 0;
		
		HashSet<Integer> arr = new HashSet<>();
		
		for(int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			String order = st.nextToken();
		
			switch (order) {
				case "add": {
					x = Integer.parseInt(st.nextToken());
					arr.add(x);
					break;
				}
				case "remove": {
					x = Integer.parseInt(st.nextToken());
					arr.remove(x);
					break;
				}
				case "check": {
					x = Integer.parseInt(st.nextToken());
					if(arr.contains(x)) 
					{
						bw.write(Integer.toString(1)+"\n");
					}
					else
					{
						bw.write(Integer.toString(0)+"\n");
					}
					
						break;
				}
				case "toggle": {
					x = Integer.parseInt(st.nextToken());
					if(arr.contains(x))
					{
						arr.remove(x);
					}
					else
					{	
						arr.add(x);
					}	
						break;
				}
				case "all": {
					arr.clear();
					for(int j=1; j<=20; j++)
					{
						arr.add(j);
					}
					break;
				}
				case "empty": {
					arr.removeAll(arr);
					break;
				}
				
			}
		}
			bw.flush();
			bw.close();
			br.close();
	}

}
