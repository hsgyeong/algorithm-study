import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		int arr[] = new int[number.length()];
		String arr2[] = new String[number.length()];

		int idx = 0;
		String num = "";
		
		for(int i=0; i<number.length(); i++)
		{
			arr[i] = Integer.parseInt(number.substring(i,i+1));
		}
		
		Arrays.sort(arr);
		
		for(int j=arr.length-1; j>=0; j--)
		{
			arr2[idx++] = Integer.toString(arr[j]);
		}
		
		for(int k=0; k<arr2.length; k++)
		{
			num += arr2[k];
		}
		
		System.out.println(Integer.parseInt(num));
	}

}
