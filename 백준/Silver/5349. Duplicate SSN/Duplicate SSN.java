import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String number = "";
		
		HashSet<String> arr = new HashSet<>();
		HashSet<String> arr2 = new HashSet<>();

		while(true)
		{
			number = sc.next();
			
			if(number.equals("000-00-0000"))
			{
				break;
			}
			
			if(!arr.contains(number))
			{
				arr.add(number);
			}
			else if(arr.contains(number))
			{
				arr2.add(number);
			}
		}

			String answer[] = arr2.toArray(new String[arr2.size()]);
		
			Arrays.sort(answer);
			
			for(String i:answer) 
			{
				System.out.println(i);
			}
	}

}
