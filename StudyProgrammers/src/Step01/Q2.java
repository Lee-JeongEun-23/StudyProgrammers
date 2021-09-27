package Step01;

public class Q2 {
	
	//가운데 글자 가져오기
	public String solution(String s) {
        String answer = "";
        String arr[] = s.split("");
        
		int length = s.length();
		if(length%2 == 0) {
			int x = (length/2);
			answer = arr[x-1]+arr[x];
		}else {
			int x = (length/2);
			answer = arr[x];
		}
        return answer;
    }
	
	//해당 문제 두번째 풀었을 때
	public String solution2nd(String s) {
        String answer = "";
        if(s.length()%2 == 0) {
            answer = s.substring((s.length()/2)-1, (s.length()/2)+1);
        }else {
            answer = s.substring((s.length()/2), (s.length()/2)+1);
        }
        return answer;
    }
	
	//////////////////////////////////////////
	String solutionA(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
    }
}
