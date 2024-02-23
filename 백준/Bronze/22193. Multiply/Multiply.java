import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		long answer = 0;
		
		String Nnum = sc.next();
		String Mnum = sc.next();
	
		answer = Long.parseLong(Nnum)*Long.parseLong(Mnum);
	
		System.out.println(answer);
	}

}
