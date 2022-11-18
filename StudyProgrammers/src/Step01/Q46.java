package Step01;

import java.util.*;
import java.util.regex.Pattern;

public class Q46 {
	
	//숫자 짝꿍
	class Solution {
	    public String solution(String X, String Y) {
	        String answer = "-1";
	        String[] xarr = X.split("");
	      String[] yarr = Y.split("");
	      
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      if(xarr.length <= yarr.length) { //X 문자열이 더 짧을 때
	         for(int i = 0; i < xarr.length; i++) {
	            for(int j = 0; j < yarr.length; j++) {
	               if(xarr[i].equals(yarr[j])) {
	                  list.add(Integer.parseInt(xarr[i]));
	                  yarr[j] = "-";
	               }
	            }
	         }
	      }else { //Y 문자열이 더 짧을 때
	         for(int i = 0; i < yarr.length; i++) {
	            for(int j = 0; j < xarr.length; j++) {
	               if(yarr[i].equals(xarr[j])) {
	                  list.add(Integer.parseInt(yarr[i]));
	                  xarr[j] = "-";
	               }
	            }
	         }
	      }
	      list.sort(Comparator.reverseOrder());
	      if(list.size() != 0) {
	         answer = "";
	         for(int i = 0; i < list.size(); i++) {
	            answer += list.get(i);
	         }
	         String pattern = "^0*$";
	         if(Pattern.matches(pattern, answer)) {
	            answer = "0";
	         }
	      }
	        return answer;
	    }
	}
}
