package Step01;

public class Q16 {
	
	//문자열을 정수로 바꾸기
	public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
	
	//////////////////////////////////////////
	public int solutionA(String str) {
        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                Sign = false;
            else if(ch !='+')
                result = result * 10 + (ch - '0');
        }
        return Sign?1:-1 * result;
	}
}
