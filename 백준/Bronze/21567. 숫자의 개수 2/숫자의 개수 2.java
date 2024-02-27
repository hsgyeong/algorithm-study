import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		BigInteger multiply = BigInteger.valueOf((long)A*B*C);
		int idx = 0;
		
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		String m = multiply.toString();
		
		for(int i=0; i<m.length(); i++)
		{
			if(m.substring(i,i+1).equals(Integer.toString(1)))
			{
				one++;
			}
			else if(m.substring(i,i+1).equals(Integer.toString(2)))
			{
				two++;
			}
			else if(m.substring(i,i+1).equals(Integer.toString(3)))
			{
				three++;
			}
			else if(m.substring(i,i+1).equals(Integer.toString(4)))
			{
				four++;
			}
			else if(m.substring(i,i+1).equals(Integer.toString(5)))
			{
				five++;
			}
			else if(m.substring(i,i+1).equals(Integer.toString(6)))
			{
				six++;
			}
			else if(m.substring(i,i+1).equals(Integer.toString(7)))
			{
				seven++;
			}
			else if(m.substring(i,i+1).equals(Integer.toString(8)))
			{
				eight++;
			}
			else if(m.substring(i,i+1).equals(Integer.toString(9)))
			{
				nine++;
			}
			else if(m.substring(i,i+1).equals(Integer.toString(0)))
			{
				zero++;
			}
			
		}
		
		System.out.println(zero+"\n"+one+"\n"+two+"\n"+three+"\n"+four
					+"\n"+five+"\n"+six+"\n"+seven+"\n"+eight+"\n"+nine);
		}

}
