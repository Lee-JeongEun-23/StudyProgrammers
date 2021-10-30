package Step01;

public class Q35 {
	
	//[카카오 인턴] 키패드 누르기
	public String solution(int[] numbers, String hand) {
        String answer = "";
        String tempL = "*";
        String tempR = "#";
        String mid = "2580";
        for(int i = 0; i < numbers.length; i++) {
            switch(numbers[i]) {
            case 1 : case 4 : case 7 :
                answer += "L";
                tempL = String.valueOf(numbers[i]);
                break;
            case 3 : case 6 : case 9 :
                answer += "R";
                tempR = String.valueOf(numbers[i]);
                break;
            default:
                int calL = 0;
                int calR = 0;
                int a = 0;
                int b = 0;
                if(tempL.equals("2") || tempL.equals("5") || tempL.equals("8") || tempL.equals("0")) {
                    a = mid.indexOf(tempL);
                    b = mid.indexOf(String.valueOf(numbers[i]));
                    calL = Math.abs((a - b));
                }else {
                    if(tempL.equals("*")) {
                        a = mid.indexOf("0");
                        b = mid.indexOf(String.valueOf(numbers[i]));
                        calL = Math.abs((a - b))+1;
                    }else {
                        a = mid.indexOf(String.valueOf(Integer.parseInt(tempL)+1));
                        b = mid.indexOf(String.valueOf(numbers[i]));
                        calL = Math.abs((a - b))+1;
                    }
                }
                if(tempR.equals("2") || tempR.equals("5") || tempR.equals("8") || tempR.equals("0")) {
                    a = mid.indexOf(tempR);
                    b = mid.indexOf(String.valueOf(numbers[i]));
                    calR = Math.abs((a - b));
                }else {
                    if(tempR.equals("#")) {
                        a = mid.indexOf("0");
                        b = mid.indexOf(String.valueOf(numbers[i]));
                        calR = Math.abs((a - b))+1;
                    }else {
                        a = mid.indexOf(String.valueOf(Integer.parseInt(tempR)-1));
                        b = mid.indexOf(String.valueOf(numbers[i]));
                        calR = Math.abs((a - b))+1;
                    }
                }               
                if(calL > calR) {                   
                    answer += "R";
                    tempR = String.valueOf(numbers[i]);

                }else if(calL < calR) {
                    answer += "L";
                    tempL = String.valueOf(numbers[i]);
                }else{
                    if(hand.equals("right")) {
                        answer += "R";
                        tempR = String.valueOf(numbers[i]);
                    }else {
                        answer += "L";
                        tempL = String.valueOf(numbers[i]);
                    }                   
                }
                break;
            }
        }
        return answer;
    }	

	//////////////////////////////////////////	
	class SolutionA {
	    //        0부터 9까지 좌표 {y,x}
	    int[][] numpadPos = {
	            {3,1}, //0
	            {0,0}, //1
	            {0,1}, //2
	            {0,2}, //3
	            {1,0}, //4
	            {1,1}, //5
	            {1,2}, //6
	            {2,0}, //7
	            {2,1}, //8
	            {2,2}  //9
	    };
	    //초기 위치
	    int[] leftPos = {3,0};
	    int[] rightPos = {3,2};
	    String hand;
	    public String solution(int[] numbers, String hand) {
	        this.hand = (hand.equals("right")) ? "R" : "L";

	        String answer = "";
	        for (int num : numbers) {
	            String Umji = pushNumber(num);
	            answer += Umji;

	            if(Umji.equals("L")) {leftPos = numpadPos[num]; continue;}
	            if(Umji.equals("R")) {rightPos = numpadPos[num]; continue;}
	        }
	        return answer;
	    }

	    //num버튼을 누를 때 어디 손을 사용하는가
	    private String pushNumber(int num) {
	        if(num==1 || num==4 || num==7) return "L";
	        if(num==3 || num==6 || num==9) return "R";

	        // 2,5,8,0 일때 어디 손가락이 가까운가
	        if(getDist(leftPos, num) > getDist(rightPos, num)) return "R";
	        if(getDist(leftPos, num) < getDist(rightPos, num)) return "L";

	        //같으면 손잡이
	        return this.hand;
	    }

	    //해당 위치와 번호 위치의 거리
	    private int getDist(int[] pos, int num) {
	        return Math.abs(pos[0]-numpadPos[num][0]) + Math.abs(pos[1]-numpadPos[num][1]);
	    }
	}
}
