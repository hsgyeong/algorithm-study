import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int changScore = 0;
		int sangScore = 0;
		
		for(int i=0; i<n; i++)
		{
			int changyeong = sc.nextInt();
			int sangduck = sc.nextInt();
			
			if(changyeong<sangduck)
			{
				changScore += sangduck;
			}
			else if(changyeong>sangduck)
			{
				sangScore += changyeong;
			}
		}
		
		System.out.println((100-changScore)+"\n"+(100-sangScore));
	}

}
