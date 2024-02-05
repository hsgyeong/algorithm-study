import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int left = sc.nextInt();
		int right = sc.nextInt();
		int sum = 0;
		
		if(left==0 && right==0)
		{
			System.out.println("Not a moose");
		}
		else if(left==right)
		{
			sum = left+right;
			System.out.println("Even "+sum);
		}
		else if(left!=right)
		{
			if(left>right)
			{
				System.out.println("Odd "+(2*left));
			}
			else if(left<right)
			{
				System.out.println("Odd "+(2*right));
			}
		}
	}

}
