package Step01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Q14 {
	
	//문자열 내림차순으로 배치하기
    public String solution(String s) {
        String answer = "";
        String a = "", b = "";
        String arr[] = s.split("");
        for(int i = 0; i < s.length(); i++) {
            if((int)(arr[i].charAt(0)) >= 97 && (int)(arr[i].charAt(0)) <= 122){
                a += arr[i];
            }
            if((int)(arr[i].charAt(0)) >= 65 && (int)(arr[i].charAt(0)) <= 90){
                b += arr[i];
            }
        }
        String[] arrA = a.split("");
        Arrays.sort(arrA, Collections.reverseOrder());
        for(int j = 0; j < arrA.length; j++) {
            answer += arrA[j];
        }
        String[] arrB = b.split("");
        Arrays.sort(arrB, Collections.reverseOrder());
        for(int j = 0; j < arrB.length; j++) {
            answer += arrB[j];
        }
        return answer;
    }
    
	//////////////////////////////////////////
    public String solutionA(String str){
    char[] sol = str.toCharArray();
    Arrays.sort(sol);
    return new StringBuilder(new String(sol)).reverse().toString();
    }
    
    public String solutionB(String str){
        return Stream.of(str.split(""))
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.joining());
    }
}
