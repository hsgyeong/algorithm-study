import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double price = 0;
		double sale = 0;
		
		for(int i=0; i<n; i++)
		{
			price = sc.nextDouble();
			
			price = price*0.80;
			
			System.out.printf("$"+"%.2f\n",price);
		}
	}

}
