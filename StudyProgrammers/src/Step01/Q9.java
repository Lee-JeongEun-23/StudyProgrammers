package Step01;

public class Q9 {
	
	//자연수 뒤집어 배열로 만들기
	public int[] solution(long n) {
        int[] answer = {};
        String[] temp = String.valueOf(n).split("");
        answer = new int[temp.length];
        int count = 0;
        for(int i = temp.length-1; i >= 0; i--) {
            answer[count] = Integer.parseInt(temp[i]);
            count++;
        }
        return answer;
    }
	
	//////////////////////////////////////////
	public int[] solutionA(long n) {
	      String a = "" + n;
	        int[] answer = new int[a.length()];
	        int cnt=0;

	        while(n>0) {
	            answer[cnt]=(int)(n%10);
	            n/=10;
	            System.out.println(n);
	            cnt++;
	        }
	      return answer;
	  }
	
	//////////////////////////////////////////
	public int[] solutionB(long n) {
	      String s = String.valueOf(n);
	      StringBuilder sb = new StringBuilder(s);
	      sb = sb.reverse(); // 문자열을 뒤집은 후 split
	      String[] ss = sb.toString().split("");

	      int[] answer = new int[ss.length];
	      for (int i=0; i<ss.length; i++) {
	          answer[i] = Integer.parseInt(ss[i]);
	      }
	      return answer;
	  }
}
