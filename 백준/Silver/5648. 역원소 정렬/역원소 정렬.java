import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String T = sc.next();
		Long arr[] = new Long[(int)Long.parseLong(T)];
		
		for(int i=0; i<Integer.parseInt(T); i++)
		{
			String num = sc.next();
			StringBuilder sb = new StringBuilder();
			
			int idx = num.length()-1;
			while(idx>=0 && num.charAt(idx)=='0')
			{
				idx--;
			}
				
			for(int j=idx; j>=0; j--)
			{
				sb.append(num.charAt(j));
			}
			
			arr[i] = Long.parseLong(sb.toString());
			
		}
		
		Arrays.sort(arr);
	
		for(int k=0; k<Long.parseLong(T); k++)
		{
			System.out.println(arr[k]);
		}
		
	}

}
