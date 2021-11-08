package Step01;

public class Q40 {
	//신규 아이디 추천
	public String solution(String new_id) {
        String answer = "";
        String temp = "";
        new_id = new_id.toLowerCase(); //1단계
        for(int i = 0; i < new_id.length(); i++) {
            if((new_id.charAt(i) >= 97 && new_id.charAt(i) <= 122) || (new_id.charAt(i) >= 48 && new_id.charAt(i) <= 57) 
                    || new_id.charAt(i) == 45 || new_id.charAt(i) == 95 || new_id.charAt(i) == 46) { //2단계
                answer += String.valueOf(new_id.charAt(i)); 
                if(i > 0 && temp.equals(".") && new_id.charAt(i) == 46) { //3단계
                    answer = answer.substring(0, answer.length()-1);
                }
                temp = String.valueOf(new_id.charAt(i));
            }
        }
        if(answer.substring(0, 1).equals(".")) { //4단계
            if(answer.equals(".")) {
                answer = "";
            }else {
                answer = answer.substring(1, answer.length());
            }
        }
        if(!answer.equals("") && answer.substring(answer.length()-1, answer.length()).equals(".")) {
            answer = answer.substring(0, answer.length()-1);
        }
        if(answer.equals("")) { //5단계
            answer = "a";
        }       
        if(answer.length() > 15) { //6단계
            answer = answer.substring(0, 15);
            if(answer.substring(answer.length()-1, answer.length()).equals(".")) {
                answer = answer.substring(0, answer.length()-1);
            }
        }
        if(answer.length() <= 2) { //7단계
            if(answer.length() == 0) {
                answer = "a";
            }
            if(answer.length() == 1) {
                answer = answer + answer + answer;
            }
            if(answer.length() == 2) {
                answer += answer.substring(1, 2);
            }
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public String solutionA(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase();

        temp = temp.replaceAll("[^-_.a-z0-9]","");
        temp = temp.replaceAll("[.]{2,}",".");
        temp = temp.replaceAll("^[.]|[.]$","");
        if(temp.equals(""))
            temp+="a";
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }
        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);

        answer=temp;
        return answer;
    }
	
	public String solutionB(String new_id) {

        String s = new KAKAOID(new_id)
                .replaceToLowerCase()
                .filter()
                .toSingleDot()
                .noStartEndDot()
                .noBlank()
                .noGreaterThan16()
                .noLessThan2()
                .getResult();


        return s;
    }

    private static class KAKAOID {
        private String s;

        KAKAOID(String s) {
            this.s = s;
        }

        private KAKAOID replaceToLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        private KAKAOID filter() {
            s = s.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        private KAKAOID toSingleDot() {
            s = s.replaceAll("[.]{2,}", ".");
            return this;
        }

        private KAKAOID noStartEndDot() {
            s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }

        private KAKAOID noBlank() {
            s = s.isEmpty() ? "a" : s;
            return this;
        }

        private KAKAOID noGreaterThan16() {
            if (s.length() >= 16) {
                s = s.substring(0, 15);
            }
            s = s.replaceAll("[.]$", "");
            return this;
        }

        private KAKAOID noLessThan2() {
            StringBuilder sBuilder = new StringBuilder(s);
            while (sBuilder.length() <= 2) {
                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
            }
            s = sBuilder.toString();
            return this;
        }

        private String getResult() {
            return s;
        }
    }
}
