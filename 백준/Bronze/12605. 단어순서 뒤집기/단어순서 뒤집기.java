import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
	
		sc.nextLine();
		
		for(int i=0; i<N; i++)
		{
			String sentence = sc.nextLine();
			
			String arr[] = sentence.split(" ");
		
			String reverseArr[] = new String [arr.length];
			
			int idx = 0;
			
			for(int j=arr.length-1; j>=0; j--)
			{
				reverseArr[idx++] = arr[j];
			}
		
				System.out.print("Case #"+(i+1)+": ");
				
			for(int k=0; k<reverseArr.length; k++)
			{	
				System.out.print(reverseArr[k]+" ");
			}
		}	
	}

}
