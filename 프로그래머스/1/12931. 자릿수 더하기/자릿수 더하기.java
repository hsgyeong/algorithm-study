import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String strn = Integer.toString(n);
        
        for(int i=strn.length(); i>0; i--)
        {
            answer += Integer.parseInt(strn.substring(i-1,i));
        }
       
        return answer;
    }
}