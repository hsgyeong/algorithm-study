import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double income = 0;
		double answer = 0;
		
		while(true)
		{
			income = Double.parseDouble(br.readLine());
			
			if(income == 0)
			{
				break;
			}
			
			if(income<=1000000)
			{
				answer = income;
			}
			else if(income>1000000 && income<=5000000)
			{
				answer = income-(income*0.1);
			}
			else if(income>5000000)
			{
				answer = income-(income*0.2);
			}
			
			bw.write(String.format("%.0f", answer)+"\n");
		}
			bw.flush();
			bw.close();
			br.close();
	}

}
