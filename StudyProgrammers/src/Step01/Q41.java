package Step01;

import java.util.ArrayList;
import java.util.HashMap;

public class Q41 {
	
	//로또의 최고 순위와 최저 순위
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int n = 0;
        ArrayList<Integer> num  = new ArrayList<Integer>();
        for(int i = 0; i < win_nums.length; i++) {
            int temp = count;
            for(int j = 0; j < lottos.length; j++) {
                if(i == 0 && lottos[j] == 0) {
                    n ++;
                }
                if(win_nums[i] == lottos[j]) {
                    count ++;
                }
            }
            if(temp == count) {
                num.add(win_nums[i]);
            }
        }
        answer[1] = win(count); //최소 로또 등수
        if(num.size() > 0) {
        	 answer[0] = win(count+n);
        }else {
            answer[0] = 1;
        }
        return answer;
    }

    private static int win(int count) {
        int result = 6;
        switch (count) {
        case 6:
            result = 1;
            break;
        case 5:
            result = 2;
            break;
        case 4:
            result = 3;
            break;
        case 3:
            result = 4;
            break;
        case 2:
            result = 5;
            break;
        }
        return result;
    }
    
	//////////////////////////////////////////
    public int[] solutionA(int[] lottos, int[] win_nums) {
    	HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }


        int sameCount = 0;
        for(int winNum : win_nums) {
            if(map.containsKey(winNum)) sameCount++;
        }

        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        return new int[] {maxRank, minRank};
    }
    
    public int[] solutionB(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int cnt1 = 0;
        int cnt2 = 0;
        for(int i : lottos) {
            if(i == 0) {
                cnt1++;
                continue;
            }
            for(int j : win_nums) {
                if(i == j) cnt2++;
            }
        }
        answer[0] = getGrade(cnt1+cnt2);
        answer[1] = getGrade(cnt2);

        return answer;
    }

    public int getGrade(int n) {
        switch(n) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }
    
}
