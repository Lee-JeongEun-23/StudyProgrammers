package Step01;

public class Q19 {
	
	//문자열 내 p와 y의 개수
	boolean solution(String s) {
        boolean answer = true;
        String[] arr =s.toLowerCase().split("");        
        int a = 0, b = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("p")) {
                a++;
            }
            if(arr[i].equals("y")) {
                b++;
            }
        }
        if(a != b) {
            answer = false;
        }
        return answer;
    }
	
	//////////////////////////////////////////
	boolean solutionA(String s) {
        s = s.toUpperCase();
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
	
	boolean solutionB(String s) {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }
        if (count == 0)
            return true;
        else
            return false;
    }
}
