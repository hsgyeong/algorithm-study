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
		
		Double T = Double.parseDouble(st.nextToken());
		double approved = 0;
		double rejected = 0;
		double invalid = 0;
		String answer = "";
		
		 st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<T; i++)
		{			
			int n = Integer.parseInt(st.nextToken());
			
			if(n==1)
			{
				approved++;
			}
			else if(n==-1)
			{
				rejected++;
			}else if(n==0)
			{
				invalid++;
			}
			
		}

		if(invalid>=(T/2))
		{
			answer = "INVALID";
		}
		else if(approved>rejected)
		{
			answer = "APPROVED";
		}
		else if(approved<rejected || approved==rejected)
		{
			answer = "REJECTED";
		}
		
		bw.write(answer);
		bw.flush();
		bw.close();
		br.close();
	}

}
