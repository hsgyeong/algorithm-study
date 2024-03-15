import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[8];
		int sum = 0;
		
		for(int i=0; i<8; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int copy[] = new int[8];
		
		for(int j=0; j<8; j++)
		{
			copy[j] = arr[j];
		}
		
		Arrays.sort(copy);
		
		int list[] = new int[5];
		int idx = 0;
		
		for(int k=7; k>=3; k--)
		{
			list[idx++] = copy[k];
		}
		
		System.out.println(Arrays.stream(list).sum());
		
		for(int l=0; l<8; l++)
		{
			for(int m=0; m<5; m++)
			{
				if(arr[l]==list[m])
				{
					System.out.print((l+1)+" ");
				}
			}
		}
	}

}
