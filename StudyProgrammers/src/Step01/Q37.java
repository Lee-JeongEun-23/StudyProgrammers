package Step01;

public class Q37 {
	
	
	//모의고사 > 다시 풀어야 함
	public int[] solution(int[] answers) {
        int[] answer = {};
        	        int[] p1 = {1, 2, 3, 4, 5};
	        int count1 = 0;

	        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
	        int count2 = 0;
	        
	        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	        int count3 = 0;
	        
	        if(answers.length/5 >= 1) { //1번 문제 찍기
	        	for(int i = 0; i < answers.length/5; i++){
		            for(int j = 0; j < p1.length; j++) {
		            	if(answers[i+j] == p1[j]) {
		            		count1 ++;
		            	}
		            }
		        }
	        	for(int i = 0; i < answers.length%5; i++){
	        		if(answers[(5*(answers.length/5))+i] == p1[i]) {
	        			count1 ++;
	            	}
	        		
		        }
	        }else {
	        	for(int i = 0; i < answers.length%5; i++){
	        		if(answers[(5*(answers.length/5))+i] == p1[i]) {
	        			count1 ++;
	        		}
		        }
	        }
	        
	        if(answers.length/8 >= 1) { //2번 문제 찍기
	        	for(int i = 0; i < answers.length/8; i++){
		            for(int j = 0; j < p2.length; j++) {
		            	if(answers[i+j] == p2[j]) {
		            		count2 ++;
		            	}
		            }
		        }
	        	for(int i = 0; i < answers.length%8; i++){
	        		if(answers[(8*(answers.length/8))+i] == p2[i]) {
	        			count2 ++;
	            	}
	        		
		        }
	        }else {
	        	for(int i = 0; i < answers.length%8; i++){
	        		if(answers[(8*(answers.length/8))+i] == p2[i]) {
	        			count2 ++;
	        		}
		        }
	        }

	        if(answers.length/10 >= 1) { //3번 문제 찍기
	        	for(int i = 0; i < answers.length/10; i++){
		            for(int j = 0; j < p3.length; j++) {
		            	if(answers[i+j] == p3[j]) {
		            		count3 ++;
		            	}
		            }
		        }
	        	for(int i = 0; i < answers.length%10; i++){
	        		if(answers[(10*(answers.length/10))+i] == p3[i]) {
	        			count3 ++;
	            	}
	        		
		        }
	        }else {
	        	for(int i = 0; i < answers.length%10; i++){
	        		if(answers[(10*(answers.length/10))+i] == p3[i]) {
	        			count3 ++;
	        		}
		        }
	        }

	        if(count1 >= count2) {
	        	if(count1 == count2) {
	        		if(count1 >= count3) {
	        			if(count1 == count3) {
		        			answer = new int[3];
		        			answer[0] = 1;
		        			answer[1] = 2;
		        			answer[2] = 3;
	        			}else {
		        			answer = new int[2];
		        			answer[0] = 1;
		        			answer[1] = 2;
	        			}
	        		}else {
	        			answer = new int[1];
	        			answer[0] = 3;
	        		}
	        	}else {
	        		if(count1 > count3) {
	        			answer = new int[1];
	        			answer[0] = 1;
	        		}else {
	        			answer = new int[1];
	        			answer[0] = 3;
	        		}
	        	}
	        }else { //count1 < count2
	        	if(count2 >= count3) {
	        		if(count2 > count3) {
	        			answer = new int[1];
	        			answer[0] = 2;
	        		}else {
	        			answer = new int[2];
	        			answer[0] = 2;
	        			answer[1] = 3;
	        		}
	        	}else {
	        		answer = new int[1];
        			answer[0] = 3;
	        	}
	        }
        return answer;
    }
}
