import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		TreeSet<Integer> arr = new TreeSet<>();
		
		st = new StringTokenizer(br.readLine());

		for(int i=0; i<a; i++)
		{
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int j=0; j<b; j++)
		{
			int num = Integer.parseInt(st.nextToken());
			if(arr.contains(num))
			{
				arr.remove(num);
			}
		}
		
			bw.write(arr.size()+"\n");
		
			for(int answer:arr)
			{
				bw.write(Integer.toString(answer)+" ");
			}
				bw.flush();
				bw.close();
				br.close();
	}

}
