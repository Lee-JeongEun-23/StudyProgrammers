package Step01;

public class Q17 {
	
	//수박수박수박수박수박수?
	public String solution(int n) {
        String answer = "";
        if(n%2 == 0) {
            for(int i = 0; i < (n/2); i++) {
                answer += "수박";
            }
        }else {
            for(int i = 0; i < (n/2); i++) {
                answer += "수박";
            }
            answer += "수";
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public String solutionA(int n){
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}
