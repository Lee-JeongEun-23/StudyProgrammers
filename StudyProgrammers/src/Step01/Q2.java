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
}
