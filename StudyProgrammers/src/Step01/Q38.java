package Step01;

import java.util.Arrays;

public class Q38 {
	
	//예산
	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            if(budget >= 0) {
                budget -= d[i];
                answer ++;
            }
        }
        if(budget < 0) {
            answer -= 1;
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public int solutionA(int[] d, int budget) {
		int answer = 0;
	    Arrays.sort(d);
	    
	    for (int i = 0; i < d.length; i++) {
	    	budget -= d[i];
	    	if (budget < 0) break;
	    		answer++;
	    }
	    return answer;
	  }
}
