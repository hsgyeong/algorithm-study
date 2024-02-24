import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int [n];
		int reverse[] = new int [n];
		int answer = 0;
		int idx = 0;
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
			
		for(int l = n-1; l>=0; l--)
		{
			reverse[idx++] = arr[l];
		}
		
		for(int m=0; m<k; m++)
		{
			answer += reverse[m];
		}
		
		System.out.println(answer);
	}

}
