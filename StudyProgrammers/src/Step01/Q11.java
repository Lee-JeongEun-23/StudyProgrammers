package Step01;

import java.util.Arrays;
import java.util.Collections;

public class Q11 {
	
	//정수 내림차순으로 배치하기
	public long solution(long n) {
        long answer = 0;
        String[] temp = String.valueOf(n).split("");
        Arrays.sort(temp, Collections.reverseOrder());
        String m = "";
        for(int i = 0; i < temp.length; i++) {
            m += temp[i];
        }
        answer = Long.parseLong(m);
        return answer;
    }
	
	//////////////////////////////////////////
	//아래 코드 해석 필요
	public class ReverseInt {
	    String res = "";
	    public int reverseInt(int n){
	        res = "";
	        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
	        return Integer.parseInt(res);
	    }

	    // 아래는 테스트로 출력해 보기 위한 코드입니다.
	    public void main(String[] args){
	        ReverseInt ri = new ReverseInt();
	        System.out.println(ri.reverseInt(118372));
	    }
	}
}
