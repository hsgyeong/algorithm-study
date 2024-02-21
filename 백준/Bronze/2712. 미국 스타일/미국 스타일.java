import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		String answer = "";
		
		for(int i=0; i<T; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			double n = Double.parseDouble(st.nextToken());
			String style = st.nextToken();
			
			if(style.equals("kg"))
			{
				answer = String.format("%.4f",n*2.2046)+" "+"lb";
			}
			else if(style.equals("l"))
			{
				answer = String.format("%.4f",n*0.2642)+" "+"g";
			}
			else if(style.equals("lb"))
			{
				answer = String.format("%.4f",n*0.4536)+" "+"kg";
			}
			else if(style.equals("g"))
			{
				answer = String.format("%.4f",n*3.7854)+" "+"l";
			}
			
			bw.write(answer+"\n");
		}
			bw.flush();
			bw.close();
			br.close();
	}

}
