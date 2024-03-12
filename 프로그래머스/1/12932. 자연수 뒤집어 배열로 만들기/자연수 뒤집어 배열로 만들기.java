class Solution {
    public int[] solution(long n) {
        
        String num = Long.toString(n);
        
        int[] answer = new int[num.length()];
        int idx = 0;
        
        for(int i = num.length()-1; i>=0; i--)
        {
            answer[idx++] = Integer.parseInt(num.substring(i,i+1));
        }
        
        return answer;
    }
}