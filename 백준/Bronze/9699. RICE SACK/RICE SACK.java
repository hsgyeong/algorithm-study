import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[5];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<5; j++)
			{
				arr[j] = sc.nextInt();	
			}
			
			Arrays.sort(arr);
			
			System.out.println("Case #"+(i+1)+": "+arr[4]);
		}
	}

}
