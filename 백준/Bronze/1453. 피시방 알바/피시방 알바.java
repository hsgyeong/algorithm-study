import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			
			if(!arr.contains(num)) {
				arr.add(num);
			}else {
				count++;
			}
		}
		System.out.println(count);
	}

}
