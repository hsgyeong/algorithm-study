import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        
        int count = 0;
       
        String list[] = myString.split("x");
        
        for(int i=0; i<list.length; i++){
            if(!list[i].isEmpty()){
               count++;
            }
        }
        
         String answer[] = new String[count];
        int idx = 0;
        
        for(int j=0; j<list.length; j++){
            if(!list[j].isEmpty()){
                answer[idx++] = list[j];
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}