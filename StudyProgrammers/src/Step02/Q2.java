package Step02;

public class Q2 {
	
	//JadenCase 문자열 만들기
	public String solution(String s) {
        String answer = "";
        String[] temp = s.split(" ");
        for(int i = 0; i < temp.length; i++) {
            if(!temp[i].equals("")) {
                answer += temp[i].substring(0,1).toUpperCase();
                answer += temp[i].substring(1,temp[i].length()).toLowerCase();
            }
            if(i != temp.length-1) {
                answer += " ";
            }
        }
        if(s.substring(s.length()-1, s.length()).equals(" ")) {
            answer+= " ";
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public String solutionA(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
  }
}
