class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int idx = 0;
        
        if(k%2!=0)
        {
            for(int i=0; i<arr.length; i++)
            {
                answer[idx++] = arr[i]*k;
            }
        }
        else if(k%2==0)
        {
            for(int i=0; i<arr.length; i++)
            {
                answer[idx++] = arr[i]+k;
            }
        }
        
        return answer;
    }
}