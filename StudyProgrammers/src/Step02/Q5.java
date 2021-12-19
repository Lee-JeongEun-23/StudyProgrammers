package Step02;

public class Q5 {
	
	//전화번호 목록 (83.3 / 100)
	//문제는 전부 다 맞았으나 타당성 전부 시간초과ㅠㅠ
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i = 0; i < phone_book.length-1; i++){
            for(int j = i+1; j < phone_book.length; j++) {
            	if(phone_book[i].length() <= phone_book[j].length()) {
            		if(phone_book[j].substring(0,phone_book[i].length()).equals(phone_book[i])) {
                		answer = false;
                		break;
            		}
            	}
            	if(phone_book[i].length() >= phone_book[j].length()) {
            		if(phone_book[i].substring(0,phone_book[j].length()).equals(phone_book[j])) {
                		answer = false;
                		break;
            		}
            	}
            }
        }
        return answer;
    }
}
