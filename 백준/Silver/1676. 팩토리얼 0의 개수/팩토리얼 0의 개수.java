import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int N;
		int m;
		BigInteger num = BigInteger.ONE;
		int answer = 0;
		
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++)
		{
			num = num.multiply(BigInteger.valueOf(i));
		}
	//	System.out.println(num);
		String a = num.toString();
		
	//	System.out.println(a);
		char spell[] = new char[a.length()];
		
		
		for(int j=0; j<a.length(); j++)
		{
			spell[j] = a.charAt(j);
		}
		
		for(int k=a.length()-1; k>=0; k--)
		{
			if(spell[k]=='0')
			{
				answer++;
		    }else{
                break;
            }    
		}
		
		System.out.println(answer);
	}

}
