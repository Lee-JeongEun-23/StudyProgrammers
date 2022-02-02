package Step02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Q8 {
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
         HashMap<String, Integer> count = new HashMap<String,Integer>();
        HashMap<Integer, String> temp = new HashMap<Integer, String>();
        ArrayList<String> count2 = new ArrayList<String>();
        for(int i = 0; i < orders.length; i++) {
        	String[] order = orders[i].split("");
        	Arrays.sort(order);
        	int n = order.length;
        	boolean[] visited = new boolean[order.length];

        	for (int j = course[0]; j <= course[course.length-1]; j++) {
        		combination(order, visited, 0, n, j, count, count2);                
            }
        }
        for(int i = 0; i < count2.size(); i++) {
        	if(count.get(count2.get(i)) < 2) {
        		count.remove(count2.get(i));
        	}else {
        		for(int j = course[0]; j <= course[course.length-1]; j++) {
            		if(count2.get(i).length() == j) {
            			if(temp.containsKey(j)) {
            				String compare = "";
            				if(temp.get(j).indexOf(",") > 0) {
            					compare = temp.get(j).split(",")[0];
            				}else {
            					compare = temp.get(j);
            				}
            				if(count.get(count2.get(i)) >= count.get(compare)) {
            					if(count.get(count2.get(i)) == count.get(compare)) {
            						temp.put(j, temp.get(j)+","+count2.get(i));
            					}else {
            						temp.put(j, count2.get(i));
            					}        					
            				}
            			}else {
            				temp.put(j, count2.get(i));
            			}
            		}
            	}
        	}      	
        }
        ArrayList<String> result = new ArrayList<String>();
        for(int i = course[0]; i <= course[course.length-1]; i++) {
        	if(temp.containsKey(i)) {
        		if(temp.get(i).indexOf(",") > 0) {
        			String[] temp3 = temp.get(i).split(",");
        			for(int j = 0; j < temp3.length; j++) {
        				result.add(temp3[j]);
        			}
        		}else {
        			result.add(temp.get(i));
        		}
        	}	
        }
        Collections.sort(result);
        answer = new String[result.size()];
        for(int i = 0; i < result.size(); i++) {
        	answer[i] = result.get(i);
        }
        return answer;
    }
    
    public void combination(String[] order, boolean[] visited, int start, int n, int r, HashMap<String,Integer> count, ArrayList<String> count2) {
		if (r == 0) {
			String temp = "";
			for (int i = 0; i < n; i++) {
	            if (visited[i]) {
	               temp += order[i];
	            }
	        }
			if(count.containsKey(temp)) {
				count.put(temp, count.get(temp)+1);
			}else {
				count2.add(temp);
				count.put(temp, 1);
			}
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(order, visited, i + 1, n, r - 1, count, count2);
            visited[i] = false;
        }
    }
}