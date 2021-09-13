package Step01;

public class Q7 {
	
	//이상한 문자 만들기
	public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(" ")) {
                answer += arr[i];
                if(i%2 == 0) {
                    temp = 1;
                }else {
                    temp = 0;
                }
            }else {
                if(i%2 == temp) {
                    answer += arr[i].toUpperCase();
                }else {
                    answer += arr[i].toLowerCase();
                }
            }           
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public String solutionA(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
}
