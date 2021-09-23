package Step01;

public class Q12 {
	
	//콜라츠 추측
	public int solution(int num) {
        int answer = 0;
        long temp = (long)num;
        while(temp != 1) {
            if(answer > 500) {
                answer = -1;
                break;
            }
            if(temp%2 == 0) {
                temp = temp/2;
            }else {
                temp = (temp*3)+1;
            }
            answer++;
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public int collatz(int num) {
	    long n = (long)num;
	    for(int i =0; i<500; i++){      
	      if(n==1) return i;
	      n = (n%2==0) ? n/2 : n*3+1;            
	    }
	    return -1;
	  }
}
