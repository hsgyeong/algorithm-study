import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt(); 
		String answer = "";
		
		if(a+b==c)
		{
		   answer = a+"+"+b+"="+c;
		}
		else if(a-b==c)
		{
			answer = a+"-"+b+"="+c;
		}	
		else if(a*b==c)
		{
			answer = a+"*"+b+"="+c;
		}
		else if(a/b==c)
		{
			answer = a+"/"+b+"="+c;
		}
		else if(a==b+c)
		{
			answer = a+"="+b+"+"+c;
		}	
		else if(a==b-c)
		{
			answer = a+"="+b+"-"+c;
		}
		else if(a==b*c)
		{
			answer = a+"="+b+"*"+c;
		}
		else if(a==b/c)
		{
			answer = a+"="+b+"/"+c;
		}
		
		System.out.println(answer);
	}

}
