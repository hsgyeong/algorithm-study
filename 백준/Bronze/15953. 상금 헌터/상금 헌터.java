import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int firstprize = 0;
		int secondprize = 0;
		
		for(int i=0; i<T; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int answer = 0;
			
			if(a==1)
			{
				firstprize = 5000000;
			}
			else if(a>=2 && a<=3)
			{
				firstprize = 3000000;
			}
			else if(a>=4 && a<=6)
			{
				firstprize = 2000000;
			}
			else if(a>=7 && a<=10)
			{
				firstprize = 500000;
			}
			else if(a>=11 && a<=15)
			{
				firstprize = 300000;
			}
			else if(a>=16 && a<=21)
			{
				firstprize = 100000;
			}
            else 
                firstprize = 0;
			
			if(b==1)
			{
				secondprize = 5120000;
			}
			else if(b>=2 && b<=3)
			{
				secondprize = 2560000;
			}
			else if(b>=4 && b<=7)
			{
				secondprize = 1280000;
			}
			else if(b>=8 && b<=15)
			{
				secondprize = 640000;
			}
			else if(b>=16 && b<=31)
			{
				secondprize = 320000;
			}
            else 
               secondprize = 0;
			
			answer = firstprize+secondprize;
			
			bw.write(Integer.toString(answer)+"\n");
		}
			bw.flush();
			bw.close();
			br.close();
	}

}
