import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int count = 0;
	
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			int order = Integer.parseInt(st.nextToken());
			
			switch (order) {
				case 1: {
					
					int X = Integer.parseInt(st.nextToken());
					push(X);
					count++;
					break;
				}
				case 2: {
					if(stack.isEmpty())
					{
						bw.write(Integer.toString(-1)+"\n");
						break;
					}
					else
						bw.write(Integer.toString(stack.pop())+"\n");
						count--;
						break;
				}
				case 3: { bw.write(Integer.toString(count)+"\n");
						  break;	
						}
				case 4: {
					if(stack.isEmpty())
					{
						bw.write(Integer.toString(1)+"\n");
						break;
					}
					else
						bw.write(Integer.toString(0)+"\n");
						break;
				}
				case 5: {
					if(stack.isEmpty())
					{
						bw.write(Integer.toString(-1)+"\n");
						break;
					}
					else
						bw.write(Integer.toString(stack.peek())+"\n");
					    break;
				}
					
			}
					
		}
			bw.flush();
			bw.close();
			br.close();
	}

	private static void push(int X) {
		// TODO Auto-generated method stub
		stack.add(X);
	}

}
