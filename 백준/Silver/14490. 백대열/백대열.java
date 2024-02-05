import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nm = sc.next();
		
		String arr[] = nm.split(":");
		
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		
		int a = 0;
		int b = 0;
		
		if(n>m)
		{
			for(int i=m; i>0; i--)
			{
				if(n%i==0 && m%i ==0)
				{	a = n/i;
					b = m/i;	
					break;
				}
			}
		}
		if(m>n)
		{
			for(int j=n; j>0; j--)
			{
				if(n%j==0 && m%j ==0)
				{	a = n/j;
					b = m/j;	
					break;
				}
			}
		}
		
		System.out.println(a+":"+b);
		
	}

}
