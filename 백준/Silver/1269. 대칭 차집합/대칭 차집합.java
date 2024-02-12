import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int Anum = Integer.parseInt(st.nextToken());
		int Bnum = Integer.parseInt(st.nextToken());
		
		int count = 0;
		
		HashSet<Integer> list = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<Anum; i++)
		{	
			int number = Integer.parseInt(st.nextToken());
			list.add(number);
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int j=0; j<Bnum; j++)
		{
			int number = Integer.parseInt(st.nextToken());
			
			if(list.contains(number))
			{
				count++;
			}
			else
			{	
				list.add(number);
			}
		}
		
		ArrayList <Integer> num = new ArrayList<Integer>(list);
		
		int length = num.size()-count;
	
		bw.write(Integer.toString(length));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
