import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			String num = sc.next();
			
			String arr[] = new String[num.length()];
			String answer = "";
			
			for(int j=0; j<num.length(); j++)
			{
				arr[j] = num.substring(j,j+1);
			}
			
			if(arr[(num.length()/2)-1].equals(arr[num.length()/2]))
			{
				answer = "Do-it";
			}
			else if(!arr[(num.length()/2)-1].equals(arr[num.length()/2]))
				answer = "Do-it-Not";
			
			System.out.println(answer);
		}	
			
	}

}
