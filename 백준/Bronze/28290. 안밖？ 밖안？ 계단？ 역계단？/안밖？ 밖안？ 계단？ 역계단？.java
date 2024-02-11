import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		String answer = "";
		
		if(word.equals("fdsajkl;")||word.equals("jkl;fdsa"))
		{
			answer = "in-out";
		}
		else if(word.equals("asdf;lkj")||word.equals(";lkjasdf"))
		{
			answer = "out-in";
		}
		else if(word.equals("asdfjkl;"))
		{
			answer = "stairs";
		}
		else if(word.equals(";lkjfdsa"))
		{
			answer = "reverse";
		}
		else 
			answer = "molu";
		
		System.out.println(answer);
	}

}
