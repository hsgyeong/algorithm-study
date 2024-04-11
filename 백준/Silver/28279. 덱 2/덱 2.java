import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static Deque<Integer> deque = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int order = 0;
		int size = 0;
		int x = 0;
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			
			st = new StringTokenizer(br.readLine());
			order = Integer.parseInt(st.nextToken());
			
			switch(order) {
				
				case 1 : 
					x = Integer.parseInt(st.nextToken());
					deque.offerFirst(x);
					size ++;
					break;
					
				case 2 : 
					x = Integer.parseInt(st.nextToken());
					deque.offerLast(x);
					size ++;
					break;
					
				case 3 : 
					if(size!=0) {
						bw.write(Integer.toString(deque.pollFirst())+"\n"); 
						size--;
					}else {
						bw.write(Integer.toString(-1)+"\n");
					}
					break;
				
				case 4 : 
					if(size!=0) {
						bw.write(Integer.toString(deque.pollLast())+"\n");
						size--;
					}else {
						bw.write(Integer.toString(-1)+"\n");
					}
					break;
					
				case 5 : 
					bw.write(Integer.toString(size)+"\n");
					break;
					
				case 6 : 
					if(size==0) {
						bw.write(Integer.toString(1)+"\n");
					}else {
						bw.write(Integer.toString(0)+"\n");
					}
					break;
					
				case 7 : 
					if(size!=0) {
						bw.write(Integer.toString(deque.peekFirst())+"\n");
					}else {
						bw.write(Integer.toString(-1)+"\n");
					}
					break;
					
				case 8 :
					if(size!=0) {
						bw.write(Integer.toString(deque.peekLast())+"\n");
					}else {
						bw.write(Integer.toString(-1)+"\n");
					}
					break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
