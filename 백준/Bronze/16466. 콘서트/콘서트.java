import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int answer = 1;
		
		for(int j=0; j<n; j++) {
			if(arr[j]!= answer) {
				break;
			}else {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
