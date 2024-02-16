import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String jaehwan = sc.next();
		String doctor = sc.next();
		int jaehwanA = 0;
		int doctorA = 0;
		String answer = "";
		
		for(int i=0; i<jaehwan.length(); i++)
		{
			if(jaehwan.substring(i, i+1).equals("a"))
			{
				jaehwanA++;
			}
		}
		
		for(int j=0; j<doctor.length(); j++)
		{
			if(doctor.substring(j, j+1).equals("a"))
			{
				doctorA++;
			}
		}
		
		if(doctorA>jaehwanA)
		{
			answer = "no";
		}
		else
			answer = "go";
		
		System.out.println(answer);
	}

}
