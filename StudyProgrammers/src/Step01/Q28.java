package Step01;

public class Q28 {
	public String solution(String s, int n) {
		
		//시저 암호
        String answer = "";
        String arr[] = s.split("");

        for(int j = 0; j < arr.length; j++) {
            if(arr[j].charAt(0) == ' ') {
                answer += " ";
            }else {
                char alpa = arr[j].charAt(0);
                int index = (int)(alpa)+n;
                if((int)alpa >= 65 && (int)alpa <= 90 && index > 90) {
                    index = index -26;                          
                }
                if((int)alpa >= 97 && (int)alpa <= 122 && index > 122) {
                    index = index -26;              
                }
                answer += String.valueOf((char)(index));
            }
        }
        return answer;
    }
	
 	//////////////////////////////////////////	
	String caesar(String s, int n) {
        String result = "";
	    n = n % 26;
	    for (int i = 0; i < s.length(); i++) {
	      char ch = s.charAt(i);
	      if (Character.isLowerCase(ch)) {
	        ch = (char) ((ch - 'a' + n) % 26 + 'a');
	      } else if (Character.isUpperCase(ch)) {
	        ch = (char) ((ch - 'A' + n) % 26 + 'A');
	      }
	      result += ch;
	    }
	        return result;
    }
}
