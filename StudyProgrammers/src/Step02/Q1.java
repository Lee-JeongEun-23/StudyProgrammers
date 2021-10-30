package Step02;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Q1 {
	
	//[1차] 뉴스 클러스터링
	public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        int answer = 0;

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        String pattern = "^[a-zA-Z]{2}$";

        for(int i = 0; i < str1.length()-1; i++) {
            if(Pattern.matches(pattern, str1.substring(i,i+2))) {
                list1.add(str1.substring(i,i+2));
            }
        }

        for(int i = 0; i < str2.length()-1; i++) {
            if(Pattern.matches(pattern, str2.substring(i,i+2))) {
                list2.add(str2.substring(i,i+2));
            }
        }

        if(list1.size() == 0 && list2.size() == 0) {
            answer = 65536;
        }else {
            double same = 0;
            int size1 = list1.size();
            int size2 = list2.size();
            if(list1.size() >= list2.size()) {
                for(int i = 0; i < size1; i++) {
                    for(int j = 0; j < size2; j++) {
                        if(list1.get(i).equals(list2.get(j))) {
                            same ++;
                            list2.remove(j);
                            size2 = size2-1;
                            break;
                        }
                    }
                }
            }else {
                for(int i = 0; i < size2; i++) {
                    for(int j = 0; j < size1; j++) {
                        if(list2.get(i).equals(list1.get(j))) {
                            same ++;
                            list1.remove(j);
                            size1 = size1-1;
                            break;
                        }
                    }
                }
            }
            if(same == 0) {
                answer = 0;
            }else {
                double cal = same / (size1+size2);
                answer = (int)(cal*65536);              
            }

        }
        return answer;
    }
}
