package Step01;

public class Q31 {
	
	//숫자 문자열과 영단어
	public int solution(String s) {
        s = s.replaceAll("zero", "0").replaceAll("one", "1").replaceAll("two","2").replaceAll("three", "3").replaceAll("four", "4")
            .replaceAll("five", "5").replaceAll("six", "6").replaceAll("seven", "7").replaceAll("eight", "8").replaceAll("nine", "9");
    int answer = Integer.parseInt(s);
    return answer;
	}
	
 	//////////////////////////////////////////
	public int solutionA(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }
        return Integer.parseInt(s);
    }
}
