import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("I");
		arr.add("O");
		arr.add("S");
		arr.add("H");
		arr.add("Z");
		arr.add("X");
		arr.add("N");
		
		String sign = sc.next();
		String answer = "YES"; 
		
		for(int i=0; i<sign.length(); i++)
		{
			if(!arr.contains(sign.substring(i,i+1)))
			{
				answer = "NO";
				break;
			}
		}
		
		System.out.println(answer);
	}

}
