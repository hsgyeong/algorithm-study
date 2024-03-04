import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int minus = a-b;
		int plus = a+b;
		
		int arr[] = new int[2];
		
		arr[0] = minus;
		arr[1] = plus;
		
		Arrays.sort(arr);
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		for(int answer: arr)
		{
			System.out.println(answer);
		}	
	}

}
