import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int left = 0;
		int right = 0;
		String answer = "";
		
		int length = N.length()/2;
		
		for(int i=0; i<length; i++)
		{
			left += Integer.parseInt(N.substring(i, i+1)); 
		}
		
		for(int j=length; j<N.length(); j++)
		{
			right += Integer.parseInt(N.substring(j,j+1));
		}
		
		if(left==right)
		{
			answer = "LUCKY";
		}
		else
			answer = "READY";
		
		System.out.println(answer);
	}

}
