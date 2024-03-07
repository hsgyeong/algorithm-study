import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			String answer = "";
			
			String line = sc.nextLine();
			
			if(line.equals("***"))
			{	
				break;
			}
			
			for(int i=line.length()-1; i>=0 ; i--)
			{
				answer += line.substring(i,i+1);
			}
			
			System.out.println(answer);
		}
		
	}

}
