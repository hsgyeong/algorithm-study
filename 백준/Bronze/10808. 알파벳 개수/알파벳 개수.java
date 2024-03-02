import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		int n = 0;
		int o = 0;
		int p = 0;
		int q = 0;
		int r = 0;
		int s = 0;
		int t = 0;
		int u = 0;
		int v = 0;
		int w = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		
		for(int ii=0; ii<word.length(); ii++)
		{
			if(word.substring(ii, ii+1).equals("a"))
			{
				a++;
			}
			else if(word.substring(ii, ii+1).equals("b"))
			{
				b++;
			}
			else if(word.substring(ii, ii+1).equals("c"))
			{
				c++;
			}
			else if(word.substring(ii, ii+1).equals("d"))
			{
				d++;
			}
			else if(word.substring(ii, ii+1).equals("e"))
			{
				e++;
			}
			else if(word.substring(ii, ii+1).equals("f"))
			{
				f++;
			}
			else if(word.substring(ii, ii+1).equals("g"))
			{
				g++;
			}
			else if(word.substring(ii, ii+1).equals("h"))
			{
				h++;
			}
			else if(word.substring(ii, ii+1).equals("i"))
			{
				i++;
			}
			else if(word.substring(ii, ii+1).equals("j"))
			{
				j++;
			}
			else if(word.substring(ii, ii+1).equals("k"))
			{
				k++;
			}
			else if(word.substring(ii, ii+1).equals("l"))
			{
				l++;
			}
			else if(word.substring(ii, ii+1).equals("m"))
			{
				m++;
			}
			else if(word.substring(ii, ii+1).equals("n"))
			{
				n++;
			}
			else if(word.substring(ii, ii+1).equals("o"))
			{
				o++;
			}
			else if(word.substring(ii, ii+1).equals("p"))
			{
				p++;
			}
			else if(word.substring(ii, ii+1).equals("q"))
			{
				q++;
			}
			else if(word.substring(ii, ii+1).equals("r"))
			{
				r++;
			}
			else if(word.substring(ii, ii+1).equals("s"))
			{
				s++;
			}
			else if(word.substring(ii, ii+1).equals("t"))
			{
				t++;
			}
			else if(word.substring(ii, ii+1).equals("u"))
			{
				u++;
			}
			else if(word.substring(ii, ii+1).equals("v"))
			{
				v++;
			}
			else if(word.substring(ii, ii+1).equals("w"))
			{
				w++;
			}
			else if(word.substring(ii, ii+1).equals("x"))
			{
				x++;
			}
			else if(word.substring(ii, ii+1).equals("y"))
			{
				y++;
			}
			else if(word.substring(ii, ii+1).equals("z"))
			{
				z++;
			}
			
		}
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h
							+" "+i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+
							p+" "+q+" "+r+" "+s+" "+t+" "+u+" "+v+" "+w+" "+
							x+" "+y+" "+z);
	}

}
