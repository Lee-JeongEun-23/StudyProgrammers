package Step02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Q10 {
	
	//올바른 괄호
	boolean solution(String s) {
        boolean answer = true;
         Stack<Character> stack = new Stack<Character>();

        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) == '(')
                stack.push('(');
            else{
                if(stack.isEmpty())
                    return false;
                else
                    stack.pop();
            }
        }
        answer = (stack.isEmpty()) ? true : false;
        return answer;
    }
	
	boolean solutionA(String s) {
		boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }
        return answer;
    }
	        
    /*
    int count = s.length() / 2;
    String[] arr = s.split("");
    ArrayList<String> temp = new ArrayList<String>(Arrays.asList(arr));
    while(count != 0) {
		for(int i = 0; i < temp.size(); i++) {
        	if(temp.get(i).equals(")")) {
        		if(i-1 >= 0 && temp.get(i-1).equals("(")) {                    		
        			temp.remove(i);
        			temp.remove(i-1);
        			
        			
        		}
        	}
        }
		count --;
	}
    if(temp.size() != 0) {
		answer = false;
	}
    System.out.println(answer);
    */
    
    
    
    /*
    String[] arr = s.split("");
    int fc = 0;
    int bc = 0;
    ArrayList<String> temp = new ArrayList<String>();
    for(int i = 0; i < arr.length; i++) {
    	temp.add(arr[i]);
    	if(arr[i].equals("(")) {
    		fc++;
    	}else {
    		bc++;
    	}
    }
    if(fc != bc) {
    	answer = false;
    }else {
    	while(fc != 0) {
    		for(int i = 0; i < temp.size(); i++) {
            	if(temp.get(i).equals(")")) {
            		if(i-1 >= 0 && temp.get(i-1).equals("(")) {                    		
            			temp.remove(i);
            			temp.remove(i-1);
            			
            			
            		}
            	}
            }
			fc --;
		}
    	if(temp.size() != 0) {
    		answer = false;
    	}
    }
    */
}
