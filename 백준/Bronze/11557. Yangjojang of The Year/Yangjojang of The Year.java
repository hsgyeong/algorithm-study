import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			String maxKey = "";
			
			for(int j=0; j<N; j++) {
				String univ = sc.next();
				int L = sc.nextInt();
				map.put(univ, L);	
			}
			
			int maxValue = Integer.MIN_VALUE;
			
			for(Map.Entry<String, Integer> entry : map.entrySet()) {
				if(entry.getValue() > maxValue) {
					maxValue = entry.getValue();
					maxKey = entry.getKey();
				}
			}
			
			System.out.println(maxKey);
		}
	}

}
