package Step02;

public class Q6 {
	
	//기능개발
    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[progresses.length];
	    int[] answer = {};
	    for(int i = 0; i < progresses.length; i++) {
	    	temp[i] = (100 - progresses[i]) % speeds[i] == 0? (100 - progresses[i]) / speeds[i] : ((100 - progresses[i]) / speeds[i])+1;
	    }
	    int count = 0;
	    int stop = temp[0];
	    String ans = "";
	    for(int i = 0; i < temp.length; i++) {
	    	if(stop >= temp[i]) {
	    		count ++;
	    	}else {
	    		ans += count + ",";
    			count = 1;
                stop = temp[i];
	    		if(i != temp.length-1 && temp[i] < temp[i+1]) {
	    			ans += count + ",";
	    		}
	    	}	    	
	    }
	    ans += count;
	    String[] val = ans.split(",");
	    answer = new int[val.length];
	    for(int i = 0; i < val.length; i++) {
	    	answer[i] = Integer.parseInt(val[i]);
	    }
        return answer;
    }
}

