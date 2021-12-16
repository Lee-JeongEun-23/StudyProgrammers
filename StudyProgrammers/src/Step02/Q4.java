package Step02;

import java.util.HashSet;

public class Q4 {
	
	//영어 끝말잇기
	public int[] solution(int n, String[] words) {   
	        int pick = 0;
	        int[] answer = {0,0};
	        HashSet<String> set = new HashSet<String>();
	        for(int i  = 0; i < words.length; i++) {
	            if(words[i].length() == 1) {
	                pick = (i+1);
	                break;
	            }
	            if(i != 0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
	                pick = (i+1);
	                break;
	            }else {
	                if(!set.contains(words[i])) {
	                    set.add(words[i]);
	                }else {
	                    pick = (i+1);
	                    break;
	                }
	            }
	        }
	        if(pick > 0) {
	            answer[0] = (pick%n) == 0? n : (pick%n);
	            answer[1] = (pick%n) == 0? (pick/n) : (int)(pick/n) + 1;
	        }
	        return answer;
    }
}
