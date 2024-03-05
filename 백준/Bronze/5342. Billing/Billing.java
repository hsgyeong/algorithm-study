import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double total = 0;
		
		while(true)
		{
			double price = 0;
			
			String item = sc.next();
			
			if(item.equals("EOI"))
			{
				break;
			}
			
			if(item.equals("Paper"))
			{
				price = 57.99;
			}
			else if(item.equals("Printer"))
			{
				price = 120.50;
			}else if(item.equals("Planners"))
			{
				price = 31.25;
			}
			else if(item.equals("Binders"))
			{
				price = 22.50;
			}
			else if(item.equals("Calendar"))
			{
				price = 10.95;
			}
			else if(item.equals("Notebooks"))
			{
				price = 11.20;
			}
			else if(item.equals("Ink"))
			{
				price = 66.95;
			}
			
			total += price;
			}
		System.out.println("$"+total);
	}

}
