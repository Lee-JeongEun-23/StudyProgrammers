package Step01;

import java.util.HashMap;

public class Q42 {
	
	//신고 결과 받기
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        for(int i = 0; i < id_list.length; i++) {
            count.put(id_list[i], 0);
        }
        HashMap<String, String> temp = new HashMap<String, String>();
        for(int i = 0; i <report.length; i++) {
            if(temp.containsKey(report[i].split(" ")[0])) {
                String[] arr = temp.get(report[i].split(" ")[0]).split(",");
                boolean check = true;
                for(String s: arr){
                    if(s.equals(report[i].split(" ")[1])) {
                        check = false;
                    }
                }
                if(check) {
                    temp.put(report[i].split(" ")[0],temp.get(report[i].split(" ")[0])+","+report[i].split(" ")[1]);
                    count.put(report[i].split(" ")[1], count.get(report[i].split(" ")[1])+1);
                }
            }else {
                temp.put(report[i].split(" ")[0],report[i].split(" ")[1]);
                count.put(report[i].split(" ")[1], count.get(report[i].split(" ")[1])+1);
            }           
        }
        for(int i = 0; i < id_list.length; i++) {
            if(count.get(id_list[i]) < k) {
                count.remove(id_list[i]);
            }
        }
        for(int i = 0; i < id_list.length; i++) {
            if(temp.containsKey(id_list[i])) {
                String[] arr = temp.get(id_list[i]).split(",");
                int check = 0;
                for(int j = 0; j < arr.length; j++) {
                    if(count.containsKey(arr[j])) {
                        check ++;
                    }
                }
                id_list[i] = String.valueOf(check);
            }else {
                id_list[i] = "0";
            }
        }
        for(int i = 0; i < id_list.length; i++) {
            answer[i] = Integer.parseInt(id_list[i]);
        }
        return answer;
    }
}
