import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		String answer = "happy";
		
		int sum = 0;
		
		sum = (1*s)+(2*m)+(3*l);
		
		if(sum<10)
			answer = "sad";
		
		System.out.println(answer);
	}

}
