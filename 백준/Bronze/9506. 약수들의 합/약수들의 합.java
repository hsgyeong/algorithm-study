import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		while(true)	{
			
			String answer = "";
			int sum = 0;
			String perfect = "";
			
			ArrayList<Integer> arr = new ArrayList<>();
			
			n = sc.nextInt();
			
			if(n == -1)
				break;
			
			for(int i=1; i<=n; i++)	{
				
				if(n%i==0) {
					arr.add(i);
				}
			}
			
			int list[] = new int[arr.size()];
			int idx = 0;
			
			for(int num:arr) {
				list[idx++] = num;
				sum += num;
			}
			
			if(sum-n!=n) {
				answer = n+" is NOT perfect.";
			}else {

				for(int j=0; j<arr.size()-1; j++) {
					perfect += Integer.toString(list[j])+" + "; 
				}
				
				answer = n+" = "+perfect.substring(0,perfect.length()-2);
			}
			
			System.out.println(answer);
		}
	
	}

}
