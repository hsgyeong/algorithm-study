import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = 0;
		int arr[] = new int[b];

		for(int i=1; i<=b; i++) {
			
			x = a * i;
			
			String X = Integer.toString(x);
			StringBuilder sb = new StringBuilder();
			
			if(X.length()>=2) {
			
				for(int j=X.length()-1; j>=0; j--){
					sb.append(X.substring(j, j+1));
				}
			
				arr[i-1] = Integer.parseInt(sb.toString());
				
			}else {
				arr[i-1] = Integer.parseInt(X);
			}
			
		}
		
		Arrays.sort(arr);
		
		int answer = arr[arr.length-1];
		
		System.out.println(answer);
		
	}

}
