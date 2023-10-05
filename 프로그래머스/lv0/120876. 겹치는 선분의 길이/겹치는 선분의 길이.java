class Solution {
    public int solution(int[][] lines) {
        
        int[] totalLine = new int[201];
        
        for(int[] line: lines) {
            
            for(int i = line[0] + 100; i < line[1] + 100 ; i++ ) {
                totalLine[i] += 1;
            }
        }
        int answer = 0;
        for(int dot : totalLine) {
            if(dot > 1) {
                answer += 1;
            }
        }
        return answer;
    }
}