import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int [N];
		int count = 0;
		
		for(int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j=0; j<N; j++)
		{
			for(int k=j+1; k<N; k++)
			{
				if((arr[j]+arr[k])==M)
				{
					count++;
				}
			}
		}
			System.out.println(count);
	}
	

}
