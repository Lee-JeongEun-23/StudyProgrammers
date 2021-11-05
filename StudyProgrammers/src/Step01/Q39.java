package Step01;

import java.util.Arrays;
import java.util.HashMap;

public class Q39 {
	
	//실패율
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double sum = 0.0;
        double fail = 0.0;
        double[] result = new double[N];
        HashMap<Double,String> cal = new HashMap<Double,String>();
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < stages.length; j++){
                if(stages[j] >= i){
                    sum++;
                }
                if(stages[j] == i){
                    fail++;
                }
            }

            double tempD = fail/sum;
            if(sum == 0) {
                tempD = 0.0;
            }
            result[i-1] = tempD;
            if(cal.containsKey(tempD)) {
                String temp = cal.get(tempD).toString();
                temp += ","+String.valueOf(i);
                cal.put(tempD, temp);
            }else {
                cal.put(tempD, String.valueOf(i));
            }
            sum = 0.0;
            fail = 0.0;
        }

        Arrays.sort(result);
        int count = 0;
        for(int i = 0; i < cal.size(); i++) {
            for(int j = result.length-1; j >=0; j-- ) {
                if(cal.containsKey(result[j])) {
                    if(cal.get(result[j]).indexOf(",") > 0) {
                        String[] temp = cal.get(result[j]).split(",");
                        for(int k = 0; k < temp.length; k++) {
                            answer[count+k] = Integer.parseInt(temp[k]);
                        }
                        count += temp.length;
                    }else {
                        answer[count] = Integer.parseInt(cal.get(result[j]));
                        count ++;
                    }
                    cal.remove(result[j]);
                }
            }
        }
        return answer;
    }
}
