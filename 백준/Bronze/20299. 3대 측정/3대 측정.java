import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int count = 0;
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<N; i++)
		{
			 st = new StringTokenizer(br.readLine());
			 
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a+b+c>=K && a>=L && b>=L && c>=L)
			{
				arr.add(a);
				arr.add(b);
				arr.add(c);
				count++;
			}
		}
			
			bw.write(count+"\n");
			
		Integer array[] = new Integer [arr.size()];
		array = arr.toArray(array);
		
		for(Integer num:array)
		{	
			bw.write(num+" ");
		}
			bw.flush();
			bw.close();
			br.close();
	}

}
