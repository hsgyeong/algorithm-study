import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String one = "";
		String two = "";
		
		sc.nextLine();
		
		for(int i=0; i<n; i++)
		{
			String sentence = sc.nextLine();
			
			String arr[] = sentence.split(" ");
			
			one = arr[0];
			two = arr[1];
			
			StringBuilder sb = new StringBuilder();
			
			for(int j=2; j<arr.length; j++)
			{
				sb.append(arr[j]+" ");
			}
			
			System.out.println(sb+one+" "+two);
		}
	
	}
}


