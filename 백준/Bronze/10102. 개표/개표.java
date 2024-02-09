import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String AB = sc.next();
		int A = 0;
		int B = 0;
		String answer = "";
		
		for(int i=n; i>0; i--)
		{
			if(AB.substring(i-1,i).equals("A"))
			{
				A++;
			}
			else if(AB.substring(i-1,i).equals("B"))
			{
				B++;
			}
		}
		
		if(A>B)
		{
			answer = "A";
		}
		else if(A<B)
		{
			answer = "B";
		}
		else
			answer = "Tie";
		
		System.out.println(answer);
	}

}
