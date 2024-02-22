import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int A[] = new int[3];
		int B[] = new int[3];
		String answer = "";
		
		for(int h=0; h<T; h++)
		{
			for(int i=0; i<3; i++)
			{
				A[i] = sc.nextInt();
			}
		
			for(int j=0; j<3; j++)
			{
				B[j] = sc.nextInt();
			}
			
			Arrays.sort(A);
			Arrays.sort(B);
			
			if( ((A[0]*A[0])+(A[1]*A[1])==(A[2]*A[2]) && (B[0]*B[0])+(B[1]*B[1])==(B[2]*B[2]))
				&& A[0]==B[0] && A[1]==B[1] && A[2]==B[2])
			{
				answer = "YES";
			}
			else
				answer = "NO";
			
			System.out.println(answer);
		}	
	}

}
