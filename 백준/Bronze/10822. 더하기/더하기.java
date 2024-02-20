import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String num [] = s.split(",");
		
		int sum = 0;
		
		for(int i=0; i<num.length; i++)
		{
			sum += Integer.parseInt(num[i]);
		}
		
		System.out.println(sum);
	}

}
