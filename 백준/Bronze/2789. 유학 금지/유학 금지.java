import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String spell [] = {"C", "A", "M", "B", "R", "I", "D", "G", "E"};
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
	
		StringBuilder answer = new StringBuilder(word);
		
		for(String delete: spell) {
			answer = new StringBuilder(answer.toString().replaceAll(delete, ""));
		}
		
		System.out.println(answer);
	}

}
