package Step01;

public class Q32 {
	
	//없는 숫자 더하기
	public int solution(int[] numbers) {
        int answer = (9*10)/2;
        for(int i = 0; i < numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
}
