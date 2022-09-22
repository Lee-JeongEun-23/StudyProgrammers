package Step02;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q11 {

	//프린터
	public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : priorities){
            pq.offer(n);
        }
        while(!pq.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(pq.peek() != null && pq.peek() == priorities[i]){
                    pq.poll();
                    answer++;
                    if(location == i) {
                    	return answer;
                    }
                }
            }
        }
        return answer;
    }
	
	public int solutionA(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;

        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }
        return answer;
    }
}
