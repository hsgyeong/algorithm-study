import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String full = br.readLine();
		String part = br.readLine();
		
		int count = 0;
		
		for(int i = 0; i<full.length();)
		{
			if(i+part.length()<=full.length())
			{
				if(full.substring(i,i+part.length()).equals(part))
				{
					count++;
					i += part.length();
				}
				else i++;
			}else
				break;
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}

}
