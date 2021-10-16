package Step01;

public class Q30 {
	
	// 부족한 금액 계산하기
	public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i = 1; i <= count; i++){
            sum += (price * i);
        }
        if(sum - money > 0 ){
            answer = sum - money;
        }
        return answer;
    }

 	//////////////////////////////////////////
	public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
