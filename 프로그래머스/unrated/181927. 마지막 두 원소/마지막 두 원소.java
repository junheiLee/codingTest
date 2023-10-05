import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length + 1];
        
        int last = num_list[length-1];
        int before = num_list[length-2];
        int addNum = 0;
        
        if(before < last) {
            addNum = last - before;
        } else {
            addNum = last * 2;
        }
        
        System.arraycopy(num_list, 0, answer, 0, length);
        answer[length] = addNum;
        return answer;
    }
}