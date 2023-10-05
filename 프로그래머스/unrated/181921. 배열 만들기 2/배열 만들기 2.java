import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        
        List<Integer> numbers = new ArrayList<>();
        int num = 0;
        
        for(int i = 0; i < 64; i++) {
            num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if(l <= num && num <= r) {
                numbers.add(num);
            }
        }
                
        return numbers.isEmpty() ? new int[] {-1} : numbers.stream().mapToInt(i -> i).toArray();
    }
}