import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		String num = "";
		String answer = "";
		
		for(int i=0; i<N; i++) {
			num += Integer.toString(N);
		}
		
		if(num.length()>M) {
			answer = num.substring(0,M);
		}else{
            answer = num;
        }
		
		System.out.println(answer);
	}

}
