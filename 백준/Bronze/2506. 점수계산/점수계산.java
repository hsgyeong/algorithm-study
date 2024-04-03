import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int score = 0;
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			
			int num = sc.nextInt();
			
			if(num==1) {
				score++;
			}else {
				score = 0;
			}
			
			answer += score;
		}
		
		System.out.println(answer);
	}

}
