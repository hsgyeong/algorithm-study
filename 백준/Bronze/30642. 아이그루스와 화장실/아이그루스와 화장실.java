import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String name = sc.next();
		int answer = 0;
		
		int now = sc.nextInt();
		
		if(now+1<=N) {
		
			if (name.equals("annyong")) {
			
				if(now%2!=0) {
					answer = now;
				}else if(now%2==0) {
					answer = now+1;
				}
			
			}else if(name.equals("induck")) {
			
				if(now%2==0) {
					answer = now;
				}else if(now%2!=0) {
					answer = now+1;
				}
			}
		
		}else {
			
			if (name.equals("annyong")) {
				
				if(now%2!=0) {
					answer = now;
				}else if(now%2==0) {
					answer = now-1;
				}
			
			}else if(name.equals("induck")) {
			
				if(now%2==0) {
					answer = now;
				}else if(now%2!=0) {
					answer = now-1;
				}
			}
		}
		
		System.out.println(answer);
	}

}
