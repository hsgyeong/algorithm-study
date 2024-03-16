import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<String> arr = new ArrayList<>();
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			String hippo = sc.next();
			
			if(!arr.contains(hippo))
			{
				arr.add(hippo);
			}
			else
				count++;
		}
		
		System.out.println(count);
	}

}
