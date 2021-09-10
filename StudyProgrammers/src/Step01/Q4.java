package Step01;

public class Q4 {
	
	//자릿수 더하기
	public int solution(int n) {
        int answer = 0;
        String arr[] = String.valueOf(n).split("");
        for(int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public int solutionA(int n) {
        int answer = 0;
        while(n>0){
            answer += n%10;
            if(n<10) {
            	break;
            }
            n=n/10;
        }
        return answer;
    }
}
