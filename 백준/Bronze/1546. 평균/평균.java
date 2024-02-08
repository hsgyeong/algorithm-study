import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double arr[] = new double [N];
		double sum = 0;
		double answer = 0;
		
		for(int i=0; i<N; i++ )
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		double M = arr[N-1];

		for(int j=0; j<N-1; j++)
		{
			sum += (arr[j]/M)*100;
		}
		
		answer =(sum+(M/M*100))/N;
		
		System.out.println(answer);
	}

}
