package Step01;

public class Q21 {
	
	//짝수와 홀수
	public String solution(int num) {
        String answer = (num == 0 || num % 2 == 0) ? "Even" : "Odd";
        return answer;
    }	
	/*
	 0 % x = 0 이므로
	  위의 코드를 더 단순화 하면,
	 String answer = (num % 2 == 0) ? "Even" : "Odd";
	 */
}
