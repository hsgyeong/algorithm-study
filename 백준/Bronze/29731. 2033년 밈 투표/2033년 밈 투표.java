import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Never gonna give you up");
		arr.add("Never gonna let you down");
		arr.add("Never gonna run around and desert you");
		arr.add("Never gonna make you cry");
		arr.add("Never gonna say goodbye");
		arr.add("Never gonna tell a lie and hurt you");
		arr.add("Never gonna stop");

		String answer  = "";
		int count = 0;

		String sentence = "";
       
		for(int i=0; i<n; i++)
		{
			sentence = br.readLine();
			
			for(int j=0; j<arr.size(); j++)
			{
				if(!arr.contains(sentence))
				{
					count++;
				}
			}
		}
		
		if(count>0)
		{
			answer = "Yes";
		}
		if(count == 0)
		{
			answer = "No";
		}	
		
		bw.write(answer);
	
		bw.flush();
		bw.close();
		br.close();
	}
		
}
