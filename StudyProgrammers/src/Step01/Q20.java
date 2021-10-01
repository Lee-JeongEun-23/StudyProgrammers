package Step01;

public class Q20 {
	
	//x만큼 간격이 있는 n개의 숫자
	public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        long temp = x;
        for(int i = 0; i < answer.length; i++) {
            answer[i] = temp;
            temp += x;
        }
        return answer;
    }

	//////////////////////////////////////////	
	public long[] solution(long x, int n) {
	      long[] answer = new long[n];
	      for(int i = 0; i < n; i++){
	          answer[i] = x * (i + 1);
	      }
	      return answer;
	  }
}
