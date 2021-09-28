package Step01;

public class Q18 {

	//문자열 다루기 기본
	public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6) {
            char[] arr = s.toCharArray();
            for(int i = 0; i < arr.length; i++) {
                if(Character.isLetter(arr[i])) {
                    answer = false;
                    break;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
	/*
	 Character.isLetter(char) : 문자인지 체크
     Character.isDigit(char) : 숫자인지 체크
	 */
	
	//////////////////////////////////////////
	public boolean solutionA(String s) {
      if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
	}
}
