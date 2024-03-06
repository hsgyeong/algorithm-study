import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		String sum = "";
		
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			
			int n = (int)ch;
			
			String st = Integer.toString(n);
			int add = 0;
			
	//		System.out.println(n);
			sum = "";
			
			for(int j=0; j<st.length(); j++)
			{
				add += Integer.parseInt(st.substring(j,j+1));
			}
			
			for(int k=0; k<add; k++)
			{
				sum += word.substring(i,i+1);
			}
			
			System.out.println(sum);
		}
		
	}
		
}
		
	
