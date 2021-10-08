package Step01;

import java.util.Arrays;

public class Q26 {
	
	//문자열 내 마음대로 정렬하기 (한번 더 풀어보기)
	public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] arr = answer.clone();

        for(int i = 0; i < strings.length; i++) {
            String temp = String.valueOf(strings[i].charAt(n));
            arr[i] = String.valueOf(temp+strings[i]);
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].substring(1, arr[i].length());
        }
        return answer;
    }
	/*
	 String a = "";
	 String b = "";
	 if(a.compareTo(b) > 0){
	 	a의 사전적 순서가 b보다 앞일 때
	 }
	 if(a.compareTo(b) < 0){
	 	b의 사전적 순서가 a보다 앞일 때
	 }
	 if(a.compareTo(b) == 0){
	 	a의 사전적 순서가 b와 같을 때
	 }
	 */
}
