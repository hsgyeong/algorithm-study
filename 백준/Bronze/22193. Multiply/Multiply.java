import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer = 0;
		
		String Nnum = sc.next();
		String Mnum = sc.next();
	
		answer = Integer.parseInt(Nnum)*Integer.parseInt(Mnum);
	
		System.out.println(answer);
	}

}
