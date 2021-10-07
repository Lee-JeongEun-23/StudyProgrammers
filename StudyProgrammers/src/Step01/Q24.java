package Step01;

import java.util.regex.Pattern;

public class Q24 {
	
	//정수 제곱근 판별
	 public long solution(long n) {
        long answer = -1;
        String pattern = "^[0-9]*.0$";
        if(n > 0 && Pattern.matches(pattern, String.valueOf(Math.sqrt(n)))) {   
            answer = (long) Math.pow((Math.sqrt(n) + 1), 2);
        }
        return answer;
    }
	 
 	//////////////////////////////////////////
	 public long solutionA(long n) {
	      if (Math.pow((int)Math.sqrt(n), 2) == n) {
	        return (long) Math.pow(Math.sqrt(n) + 1, 2);
	      }
	      return -1;
	  }
}
