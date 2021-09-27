package Step01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Q15 {

	//두 개 뽑아서 더하기
	public int[] solution(int[] numbers) {
	    int[] answer = {};
	    ArrayList<Integer> arr = new ArrayList<Integer>();

	    for(int i = 0; i < numbers.length-1; i++) {
	        for(int j = i+1; j < numbers.length; j++) {
	            int temp = numbers[i]+numbers[j];
	            if(!arr.contains(temp)) {
	                arr.add(temp);
	            }
	        }
	    }
	    Collections.sort(arr);
	    answer = new int[arr.size()];
	    for(int j = 0; j < arr.size(); j++) {
	        answer[j] = arr.get(j);
	    }
	    return answer;
	}
	
	//////////////////////////////////////////
	public static ArrayList<Integer> solutionA(int[] numbers) { //리턴타입 변경 가능
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            answer.add(iter.next());
        }

        Collections.sort(answer);
        return answer;
    }
}
