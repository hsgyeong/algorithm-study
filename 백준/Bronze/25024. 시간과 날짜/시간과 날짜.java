import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String time = "";
		String date = "";
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x<=23 && y<=59) {
				time = "Yes";
			}else 
				time = "No";
			
			if((x==1||x==3||x==5||x==7||x==8||x==10||x==12)&&y>=1&&y<=31) {
				date = "Yes";
			}else if((x==4||x==6||x==9||x==11)&&y>=1&&y<=30) {
				date = "Yes";
			}else if(x==2&&y>=1&&y<=29) {
				date = "Yes";
			}else 
				date = "No";
			
			System.out.println(time+" "+date);
		}
	}

}
