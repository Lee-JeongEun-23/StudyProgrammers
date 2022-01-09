package Step02;

import java.util.HashMap;

public class Q7 {

	//오픈채팅방
	public String[] solution(String[] record) {
        String[] answer = {};
        int count = 0;
        HashMap<String, String> temp = new HashMap<String, String>();
        for(int i = 0; i < record.length; i++) {
            if(record[i].split(" ")[0].equals("Enter") || record[i].split(" ")[0].equals("Change")) {
                temp.put(record[i].split(" ")[1], record[i].split(" ")[2]);
            }
            if(record[i].split(" ")[0].equals("Enter") || record[i].split(" ")[0].equals("Leave")) {
                count++;
            }
        }
        answer = new String[count];
        int index = 0;
        for(int i = 0; i < record.length; i++) {
            if(record[i].split(" ")[0].equals("Enter") && temp.containsKey(record[i].split(" ")[1])) {
                answer[index] = temp.get(record[i].split(" ")[1])+ "님이 들어왔습니다.";
                index ++;
            }
            if(record[i].split(" ")[0].equals("Leave") && temp.containsKey(record[i].split(" ")[1])) {
                answer[index] = temp.get(record[i].split(" ")[1])+ "님이 나갔습니다.";
                index ++;
            }
        }
        return answer;
    }
}
