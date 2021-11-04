package Step01;

public class Q37 {
	
	//모의고사
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
                    if(answers[(5*i)+j] == p1[j]) {
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
                if(answers[i] == p1[i]) {
                    count1 ++;
                }
            }
        }

        if(answers.length/8 >= 1) { //2번 문제 찍기
            for(int i = 0; i < answers.length/8; i++){
                for(int j = 0; j < p2.length; j++) {
                    if(answers[(8*i)+j] == p2[j]) {
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
                if(answers[i] == p2[i]) {
                    count2 ++;
                }
            }
        }

        if(answers.length/10 >= 1) { //3번 문제 찍기
            for(int i = 0; i < answers.length/10; i++){
                for(int j = 0; j < p3.length; j++) {
                    if(answers[(10*i)+j] == p3[j]) {
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
                if(answers[i] == p3[i]) {
                    count3 ++;
                }
            }
        }
        int max = Math.max(Math.max(count1, count2),count3);
        String temp = "";
        int count  = 0;
        if(max == count1) {
           temp += "1,";
           count ++;
        }
        if(max == count2) {
           temp += "2,";
           count ++;
        }
        if(max == count3) {
           temp += "3,";
           count ++;
        }
        String[] arr = temp.split(",");
        answer = new int[count];
        for(int i = 0; i < arr.length; i++) {
           answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
