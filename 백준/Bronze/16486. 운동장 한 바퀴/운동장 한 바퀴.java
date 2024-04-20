import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double answer = 0;
		
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		
		answer = (d1*2)+((d2*2)*3.141592);
		
		System.out.println(answer);
	}

}
