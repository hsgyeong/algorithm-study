import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int count = 0;
		
		for(int i=0; i<word.length();)
		{	
			if(i+2<word.length() && word.substring(i,i+3).equals("dz="))
			{
				count++;
				i+=3;
			}
			else if(i+1<word.length() && (word.substring(i,i+2).equals("c=")||
				word.substring(i,i+2).equals("c-")||
				word.substring(i,i+2).equals("d-")||
				word.substring(i,i+2).equals("lj")||
				word.substring(i,i+2).equals("nj")||
				word.substring(i,i+2).equals("s=")||
				word.substring(i,i+2).equals("z=")))
			{
				count++;
				i+=2;
			}
			else {
				count++;
				i++;
			}
		  }
		
		System.out.println(count);
	}

}
