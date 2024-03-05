import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sentence = br.readLine();
		String word = br.readLine();
		int count = 0;
		
		for(int i=0; i<sentence.length(); i++)
		{
			if(i+word.length()<=sentence.length())
			{
				if(sentence.substring(i,i+word.length()).equals(word))
				{
					count++;
				}		
			}	
		}
		
		System.out.println(count);
		
	}

}
