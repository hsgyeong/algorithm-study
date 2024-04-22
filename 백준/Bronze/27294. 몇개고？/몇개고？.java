import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int S = sc.nextInt();
		int rice = 0;
		
		if(T<=11||T>16||S==1) {
			rice = 280;
		}else if(T>=12 && T<=16 && S==0) {
			rice = 320;
		}
		
		System.out.println(rice);
	}

}
