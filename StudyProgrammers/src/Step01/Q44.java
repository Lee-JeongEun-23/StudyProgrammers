package Step01;

import java.util.Arrays;

public class Q44 {
	
	//체육복
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean same = false;
        answer = n - lost.length;
        int except = 0;
        if(reserve.length >= lost.length) {
        	int temp = 0;
        	for(int i = 0; i < reserve.length; i++) {
        		same = Arrays.asList(lost).contains(reserve[i]);
        		if(same) {
        			except ++;
        		}
        		for(int j = temp; j < lost.length; j++) {
        			if(Math.abs(reserve[i]-lost[j]) <= 1) {
        				temp++;
        				break;
        			}else {
        				except ++;
        			}
        		}
        	}
        	answer += lost.length-except;
        }else {
        	int temp = 0;
        	for(int i = 0; i < lost.length; i++) {
        		same = Arrays.asList(reserve).contains(lost[i]);
        		if(same) {
        			except ++;
        		}
        		for(int j = temp; j < reserve.length; j++) {
        			if(Math.abs(reserve[i]-lost[j]) <= 1) {
        				temp++;
        				break;
        			}else {
        				except ++;
        			}
        		}
        	}
        	answer += reserve.length-except;
        }
        return answer;
    }
}
