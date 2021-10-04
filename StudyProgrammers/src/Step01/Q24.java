package Step01;

public class Q24 {
	
	//정수 제곱근 판별
	public long solution(long n) { //틀린 이유 찾기
		long answer = -1;
        if(n > 0 && String.valueOf(Math.sqrt(n)).contains(".0")) {
        answer = (long) Math.pow((Math.sqrt(n) + 1), 2);
        }
        return answer;
    }
}
