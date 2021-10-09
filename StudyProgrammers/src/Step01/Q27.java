package Step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q27 {
	
	//나누어 떨어지는 숫자 배열
	public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer.add(arr[i]);
            }
        }
        if(answer.size() == 0){
            answer.add(-1);
        }

        Collections.sort(answer);
        return answer;
    }
	
 	//////////////////////////////////////////	
	public int[] solutionA(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        java.util.Arrays.sort(answer);
        return answer;
	}
}
