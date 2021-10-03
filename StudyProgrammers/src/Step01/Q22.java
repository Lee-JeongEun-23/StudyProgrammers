package Step01;

public class Q22 {
	
	//두 정수 사이의 합
	public long solution(int a, int b) {
        long answer = 0;
        if(a == b) {
            answer = a;
        }else if(a > b) {
            for(int i = b; i <= a; i++) {
                answer += i;
            }
        }else {
            for(int i = a; i <= b; i++) {
                answer += i;
            }
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public long solutionA(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }
    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
    
    public long solutionB(int a, int b) {
        long answer = 0;
        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
            answer += i;

        return answer;
    }
}
