package Step02;

import java.util.Arrays;

public class Q12 {
	
	//최소직사각형
	public int solution(int[][] sizes) {
        int wMax = 0;
		int hMax = 0;
        for(int i = 0; i < sizes.length; i++){
            int[] temp = new int[2];
            temp[0] = sizes[i][0];
            temp[1] = sizes[i][1];
            Arrays.sort(temp);
            if(wMax <= temp[0]) {
            	wMax = temp[0];
            }
            if(hMax <= temp[1]) {
            	hMax = temp[1];
            }
        }
        return wMax * hMax;
    }
	
	public int solutionA(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}
