package Step01;

public class Q45 {
	
	//약수의 개수와 덧셈
	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;
	        for(int i = left; i <= right; i++) {
	            int count = 0;
	            int sqrt = (int) Math.sqrt(i);
	            for(int j = 1; j <= sqrt; j++){
	               if(i % j == 0){ // 약수 중 작은 수 저장
	                   count++;
	                    if(i / j != j){ // 약수 중 큰 수 저장
	                        count++;
	                    }
	                }
	            }
	            if(count % 2 == 0) { //짝수일 때
	                answer += i;
	            }else { //홀수일 때
	                answer -= i;
	            }
	        }
	        return answer;
	    }
	}
	
	class SolutionA {
	    public int solution(int left, int right) {
	        int answer = 0;

	        for (int i=left;i<=right;i++) {
	            //제곱수인 경우 약수의 개수가 홀수
	            if (i % Math.sqrt(i) == 0) {
	                answer -= i;
	            }
	            //제곱수가 아닌 경우 약수의 개수가 짝수
	            else {
	                answer += i;
	            }
	        }

	        return answer;
	    }
	}
	
}
