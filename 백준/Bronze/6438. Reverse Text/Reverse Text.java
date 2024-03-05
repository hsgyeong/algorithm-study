import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++)
		{
			String sentence = sc.nextLine();
			String reverse = "";
			
			for(int j=sentence.length()-1; j>=0; j--)
			{
				reverse += sentence.substring(j,j+1);
			}
			
			System.out.println(reverse);
		}
	}

}
