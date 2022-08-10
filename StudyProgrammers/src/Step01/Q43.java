package Step01;

import java.util.HashMap;
import java.util.HashSet;

public class Q43 {
	
	//폰켓몬
	public int solution(int[] nums) {
        int total = 0;
		int take = 0;
		int key = 0;
		int answer = 0;
		
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(data.containsKey(nums[i])) {
				data.put(nums[i], data.get(nums[i])+1);
			}else {
				data.put(nums[i], 1);
				key++;
			}
			total ++;
		}
		take = total / 2;
	
		if(key >= take) {
			answer = take;
		}else {
			answer = key;
		}
        return answer;
    }
	
	//////////////////////////////////////////
	class SolutionA {
	    public int solution(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for(int i =0; i<nums.length;i++) {
            hs.add(nums[i]);
        }

        if(hs.size()>nums.length/2)
            return nums.length/2;
        return hs.size();
	    }
	}
}
