package Step02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import static java.util.stream.Collectors.*;

public class Q9 {

	//위장
	public int solution(String[][] clothes) {
        ArrayList<String> name = new ArrayList<String>();
	        HashMap<String,Integer> temp = new HashMap<String,Integer>();
			for (int i = 0; i < clothes.length; i++) {
				if(temp.containsKey(clothes[i][1])) {
		    		temp.put(clothes[i][1], temp.get(clothes[i][1])+1);
		    	}else {
		    		temp.put(clothes[i][1], 1);
		    		name.add(clothes[i][1]);
		    	}
			}
			int sum = 1;
			for(int i = 0; i < name.size(); i++) {
				sum *= temp.get(name.get(i)) + 1;
			}
			int answer = sum -1;
        return answer;
    }
	
	//////////////////////////////////////////
	public int solutionA(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }
	
	public int solutionB(String[][] clothes) {
        // 1. 옷을 종류별로 구분하기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 입지 않는 경우를 추가하여 모든 조합 계산하기
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        
        while(it.hasNext())
            answer *= it.next().intValue() + 1;

        // 3. 아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;
    }
}
