package Step01;

public class Q29 {
	
	//나머지가 1이 되는 수 찾기
	public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 1000000; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
