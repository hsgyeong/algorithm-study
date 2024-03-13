import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String answer = "뭐야?";
		
		for(int i=0; i<n; i++)
		{
			String name = sc.next();
			
			if(name.equals("anj"))
			{	
				answer = "뭐야;";
			}
		}
			System.out.println(answer);
	}

}
