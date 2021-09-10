package Step01;

import java.util.ArrayList;

public class Q6 {

	//같은 숫자는 싫어
	public int[] solution(int []arr) {
        int[] answer = {};

        if(arr.length <= 1){
              answer = arr;
              return answer;
          }
        int temp = arr[0];
        int x = 1, y = -1;
        for(int i = 1; i < arr.length; i++) {
            if(temp == arr[i]) {
                arr[i] = -1;
            }else {
                x ++;
                temp = arr[i];
            }
        }
        answer = new int[x];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) {
                y++;
                answer[y] = arr[i];
            }
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public int[] solutionA(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
