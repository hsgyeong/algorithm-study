import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for(int i=0; i<T; i++)
		{
			st = new StringTokenizer(br.readLine());
			sum = 0;
			ArrayList<Integer> even = new ArrayList<>();
			
			for(int j=0; j<7; j++)
			{
				int num = Integer.parseInt(st.nextToken());
				
				if(num%2==0)
				{
					even.add(num);
					sum += num;
				}
			}
			
			Integer [] arr = even.toArray(new Integer[0]);
			
			Arrays.sort(arr);
			
			bw.write(sum+" "+arr[0]+"\n");
		}
			bw.flush();
			bw.close();
			br.close();
	}

}
