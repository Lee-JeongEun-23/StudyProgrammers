package Step01;

import java.util.Arrays;

public class Q5 {
	
	//제일 작은 수 제거하기
	public int[] solution(int[] arr) {
        int[] answer = {};
        int[] temp = arr.clone();
        if(arr.length <= 1) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            Arrays.sort(temp);
            int x = temp[0];
            int y = 0, z = -1;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == x) {
                    y ++;
                }
            }
            answer = new int[arr.length-y];
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != x) {
                    z ++;
                    answer[z] = arr[i];
                }
            }
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public int[] solutionA(int[] arr) {
	      if (arr.length <= 1) return new int[]{-1};
	      int min = Arrays.stream(arr).min().getAsInt();
	      return Arrays.stream(arr).filter(i -> i != min).toArray();
	  }
	
	//////////////////////////////////////////
	public int[] solutionB(int[] arr) {
	      if(arr.length <= 1){
	          int[] answer = {-1};
	          return answer;
	      }

	      int[] answer = new int[arr.length-1];
	      int minIndex=0;

	      for(int i=0;i<arr.length;i++){
	          if(arr[minIndex]>arr[i]){
	              minIndex = i;
	          }
	      }
	      for(int i=minIndex+1;i<arr.length;i++){
	          arr[i-1] = arr[i];
	      }
	      for(int i=0;i<answer.length;i++){
	          answer[i] = arr[i];
	      }
	      return answer;
	  }
}
