package Step01;

public class Q10 {
	
	//평균 구하기
	public double solution(int[] arr) {
        double answer = 0;
        double temp = 0;
        for(int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        answer = temp/arr.length;
        return answer;
    }
}
