import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String answer = "";
		
		for (int i=0; i<(15*15); i++) {
			String spell = sc.next();
			
			if(spell.equals("w")) {
				answer = "chunbae";
				break;
			}else if(spell.equals("b")) {
				answer = "nabi";
				break;
			}else if(spell.equals("g")) {
				answer = "yeongcheol";
				break;
			}
		}
		
		System.out.println(answer);
	}

}
