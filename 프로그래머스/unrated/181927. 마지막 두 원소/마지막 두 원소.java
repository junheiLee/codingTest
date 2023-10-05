import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length + 1];
        
        int lastNum = num_list[length-1];
        int laterNum = num_list[length-2];
        int addNum = 0;
        
        if(laterNum < lastNum) {
            addNum = lastNum - laterNum;
        } else {
            addNum = lastNum * 2;
        }
        
        System.arraycopy(num_list, 0, answer, 0, length);
        answer[length] = addNum;
        return answer;
    }
}