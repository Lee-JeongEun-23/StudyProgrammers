package Step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q33 {
	
	// K번째수
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        for(int i = 0; i < commands.length; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[count] = list.get(commands[i][2]-1);
            count++;
        }
        return answer;
    }
		
	//////////////////////////////////////////	
	public int[] solutionA(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int a = 0;
        for(int[] info : commands){
            int i = info[0];
            int j = info[1];
            int k = info[2];

            int[] buf = Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(buf);
            answer[a] = buf[k-1];
            a++;
        }
        return answer;
    }
}
