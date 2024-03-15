import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			String a = sc.next();
			String b = sc.next();
			
			String answer = "";
			
			String A[] = new String[a.length()];
			String B[] = new String[b.length()];
			
			for(int j=0; j<a.length(); j++)
			{
				A[j] = a.substring(j,j+1);
			}
			
			for(int k=0; k<b.length(); k++)
			{
				B[k] = b.substring(k,k+1);
			}
			
			Arrays.sort(A);
			Arrays.sort(B);
			
			for(int l=0; l<B.length; l++)
			{
				if(!A[l].equals(B[l]))
				{
					answer = "Impossible";
					break;
				}
				else 
					answer = "Possible";
			}
			
			System.out.println(answer);
		}
	}

}
