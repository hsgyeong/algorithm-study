import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer = "";
		
		while(true)
		{
			String a = sc.next();
			String letter = sc.next();
			String b = sc.next();
			
			if(Integer.parseInt(a)==0 && letter.equals("W") && Integer.parseInt(b)==0)
			{ 
				break;
			}
			
			if(letter.equals("W"))
			{
				answer = Integer.toString(Integer.parseInt(a)-Integer.parseInt(b));
				
				if(Integer.parseInt(answer)<-200)
				{
					answer = "Not allowed";
				}
			}
			else if(letter.equals("D"))
			{
				answer = Integer.toString(Integer.parseInt(a)+Integer.parseInt(b));
			}
			
			System.out.println(answer);
		}
	}

}
