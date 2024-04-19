import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(num!=0) {
				arr.add(num);
			}else if(num==0){
				arr.remove(arr.size()-1);
			}
		}
		
		for(Integer element : arr) {
			answer += element;
		}
		
		System.out.println(answer);
	}

}
