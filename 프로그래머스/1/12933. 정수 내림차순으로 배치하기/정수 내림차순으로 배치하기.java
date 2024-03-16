import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String reverse = "";
        
        String num = Long.toString(n);
        int arr [] = new int[num.length()];
        
        for(int i=0; i<num.length(); i++)
        {
            arr[i] = Integer.parseInt(num.substring(i,i+1));
        }
        
        Arrays.sort(arr);
        
        for(int j=arr.length-1; j>=0; j--)
        {
            reverse += Integer.toString(arr[j]);
        }
        
        answer = Long.parseLong(reverse);
        
        return answer;
    }
}