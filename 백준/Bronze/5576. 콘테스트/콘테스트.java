import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int W[] = new int[10];
		int K[] = new int[10];
		int a = 0;
		int b = 0;
		
		for(int i=0; i<10; i++)
		{
			W[i] = sc.nextInt();
		}
		
		for(int j=0; j<10; j++)
		{
			K[j] = sc.nextInt();
		}
		
		Arrays.sort(W);
		Arrays.sort(K);
		
		for(int l=9; l>6; l--)
		{
			a += W[l];
			b += K[l];
		}
		
		System.out.println(a+" "+b);
	}

}
