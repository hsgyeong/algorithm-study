import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word;
		word = br.readLine();
		int count = 0;
		int ycount = 0;
		
		for(int i=word.length(); i>0; i--)
		{
			if(word.substring(i-1, i).equals("a")||
				word.substring(i-1, i).equals("e")||
				word.substring(i-1, i).equals("i")||
				word.substring(i-1, i).equals("o")||
                word.substring(i-1, i).equals("u"))
			{
				count++;
			}
			
			if(word.substring(i-1, i).equals("y"))
			{
				ycount++;
			}
		}
		
		bw.write(count+" "+(count+ycount));
		bw.flush();
		br.close();
		bw.close();
	}

}
