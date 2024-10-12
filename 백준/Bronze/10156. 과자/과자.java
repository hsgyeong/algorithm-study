import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int money = 0;
		
		if(K*N > M) {
			money = (K*N)-M;
		}else
			money = 0;
		
		System.out.println(money);
	}
}
