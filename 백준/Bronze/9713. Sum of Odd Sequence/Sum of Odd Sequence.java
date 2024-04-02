import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			
			int num = sc.nextInt();
			sum = 0;
			
			for(int j=1; j<=num; j++) {
				if(j%2!=0){
					sum += j;
				}
			}
			
			arr[i] = sum;
		}
		
		for(int answer : arr) {
			System.out.println(answer);
		}
		
	}

}
