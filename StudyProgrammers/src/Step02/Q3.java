package Step02;

public class Q3 {

	//올바른 괄호 (효율성은 시간초과 / 모든 문제는 전부 다 맞은 상태)
	boolean solution(String s) {
        boolean answer = true;
        
        int len = 0;
		while(s.length() != len) {
			len = s.length();
			s = s.replaceAll("\\(\\)", "");
		}
		if(s.length() != 0) {
			answer = false;
		}

        return answer;
    }
}
