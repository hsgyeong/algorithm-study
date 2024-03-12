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
		
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		String morse[] = new String [n];
		String spell="";
		
		for(int i=0; i<n; i++)
		{
			morse[i] = st.nextToken();
		}
		
		for(int j=0; j<n; j++)
		{
			if(morse[j].equals(".-"))
			{
				spell += "A";
			}
			else if(morse[j].equals("-..."))
			{
				spell += "B";
			}
			else if(morse[j].equals("-.-."))
			{
				spell += "C";
			}
			else if(morse[j].equals("-.."))
			{
				spell += "D";
			}
			else if(morse[j].equals("."))
			{
				spell += "E";
			}
			else if(morse[j].equals("..-."))
			{
				spell += "F";
			}
			else if(morse[j].equals("--."))
			{
				spell += "G";
			}
			else if(morse[j].equals("...."))
			{
				spell += "H";
			}
			else if(morse[j].equals(".."))
			{
				spell += "I";
			}
			else if(morse[j].equals(".---"))
			{
				spell += "J";
			}
			else if(morse[j].equals("-.-"))
			{
				spell += "K";
			}
			else if(morse[j].equals(".-.."))
			{
				spell += "L";
			}
			else if(morse[j].equals("--"))
			{
				spell += "M";
			}
			else if(morse[j].equals("-."))
			{
				spell += "N";
			}
			else if(morse[j].equals("---"))
			{
				spell += "O";
			}
			else if(morse[j].equals(".--."))
			{
				spell += "P";
			}
			else if(morse[j].equals("--.-"))
			{
				spell += "Q";
			}
			else if(morse[j].equals(".-."))
			{
				spell += "R";
			}
			else if(morse[j].equals("..."))
			{
				spell += "S";
			}
			else if(morse[j].equals("-"))
			{
				spell += "T";
			}
			else if(morse[j].equals("..-"))
			{
				spell += "U";
			}
			else if(morse[j].equals("...-"))
			{
				spell += "V";
			}
			else if(morse[j].equals(".--"))
			{
				spell += "W";
			}
			else if(morse[j].equals("-..-"))
			{
				spell += "X";
			}
			else if(morse[j].equals("-.--"))
			{
				spell += "Y";
			}
			else if(morse[j].equals("--.."))
			{
				spell += "Z";
			}
			else if(morse[j].equals(".----"))
			{
				spell += "1";
			}
			else if(morse[j].equals("..---"))
			{
				spell += "2";
			}
			else if(morse[j].equals("...--"))
			{
				spell += "3";
			}
			else if(morse[j].equals("....-"))
			{
				spell += "4";
			}
			else if(morse[j].equals("....."))
			{
				spell += "5";
			}
			else if(morse[j].equals("-...."))
			{
				spell += "6";
			}
			else if(morse[j].equals("--..."))
			{
				spell += "7";
			}
			else if(morse[j].equals("---.."))
			{
				spell += "8";
			}
			else if(morse[j].equals("----."))
			{
				spell += "9";
			}
			else if(morse[j].equals("-----"))
			{
				spell += "0";
			}
			else if(morse[j].equals("--..--"))
			{
				spell += ",";
			}
			else if(morse[j].equals(".-.-.-"))
			{
				spell += ".";
			}
			else if(morse[j].equals("..--.."))
			{
				spell += "?";
			}
			else if(morse[j].equals("---..."))
			{
				spell += ":";
			}
			else if(morse[j].equals("-....-"))
			{
				spell += "-";
			}
			else if(morse[j].equals(".--.-."))
			{
				spell += "@";
			}
		}
			bw.write(spell);
			bw.flush();
			bw.close();
			br.close();
	}	
			
}
