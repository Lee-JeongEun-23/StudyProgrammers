package Step02;

public class Q6 {
	
	//기능개발
	public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[progresses.length];
        int[] answer = {};
        for(int i = 0; i < progresses.length; i++) {
            temp[i] = (100 - progresses[i]) % speeds[i] == 0? (100 - progresses[i]) / speeds[i] : ((100 - progresses[i]) / speeds[i])+1;
        }
        int stop = temp[0];
        int len = 0;
        for(int i = 0; i < temp.length; i++) {
            if(stop > temp[i] || (i > 0 && temp[i] == stop)) { 
                progresses[i] = -1;
            }else {
                stop = temp[i];
                progresses[i] = stop;
                len ++;
            }
        }
        int count = 1;
        answer = new int[len];
        int j = 0;
        for(int i = 0; i < progresses.length; i++) {
            if(progresses[i] < 0) {
                count ++;
                answer[j] = count;
            }else {
                count = 1;
                if(i != 0) {
                    j ++;
                }
                answer[j] = count;
            }
        }
        return answer;
    }	
}

