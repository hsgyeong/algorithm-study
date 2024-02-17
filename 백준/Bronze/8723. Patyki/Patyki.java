import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int answer = 0;
		
		if(a==b && b==c && a==c)
		{
			answer = 2;
		}
		else if(((a*a)+(b*b))==c*c || ((a*a)+(c*c))==b*b || ((b*b)+(c*c))==a*a)
		{
			answer = 1;
		}
		else
			answer = 0;
		
		System.out.println(answer);
	}

}
