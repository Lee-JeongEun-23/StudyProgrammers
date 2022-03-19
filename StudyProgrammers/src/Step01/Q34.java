package Step01;

import java.util.Arrays;
import java.util.HashMap;

public class Q34 {
	
	//완주하지 못한 선수
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < participant.length-1; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        if(answer.equals("")) {
            answer = participant[participant.length-1];
        }
        return answer;
    }

	public String solutionC(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";
        for(int i = 0; i < completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
        		answer = participant[i];
        	}
        }
        if(answer.equals("")) {
        	answer = participant[participant.length-1];
        }        
        return answer;
    }
	//////////////////////////////////////////	
	public String solutionA(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
	
	public String solutionB(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
	
}
