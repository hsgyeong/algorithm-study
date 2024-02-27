import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String answer = "";
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0; i<5; i++)
		{
			String FBI = sc.next();
		
			outloop:
				for(int j=0; j<FBI.length(); j++)
				{
					
					if(j+3<=FBI.length())
					{
						if(FBI.substring(j,j+3).equals("FBI"))
						{
							answer = (i+1)+" ";

							arr.add(answer);
							break outloop;
						}
					}
				}
		
		}
		
		if(arr.size()==0)
		{
			System.out.println("HE GOT AWAY!");
		}
		else 
		{	
			String num[] = arr.toArray(new String[arr.size()]);
		
			for(String number: num)
			{
				System.out.print(number);
			}
		}	
	}
}
