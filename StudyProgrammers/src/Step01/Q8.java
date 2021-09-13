package Step01;

public class Q8 {
	
	//핸드폰 번호 가리기
	public String solution(String phone_number) {
        String answer = "";
        if(phone_number.length() == 4) {
            answer = phone_number;
        }else {
            for(int i = 0; i < phone_number.length()-4; i++) {
                answer += "*";
            }
            answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public String solutionA(String phone_number) {
	     char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
	  }
}
