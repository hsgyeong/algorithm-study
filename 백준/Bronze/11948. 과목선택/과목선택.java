import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int science [] = new int[4];
		int others[] = new int[2];
		int answer = 0;
		
		for(int i=0; i<4; i++) {
			science[i] = sc.nextInt();
		}
		
		for(int j=0; j<2; j++) {
			others[j] = sc.nextInt();
		}
		
		Arrays.sort(science);
		Arrays.sort(others);
		
		answer = science[3]+science[2]+science[1]+others[1];
		
		System.out.println(answer);
	}

}
