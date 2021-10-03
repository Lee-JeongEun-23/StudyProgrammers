package Step01;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q23 {

	//직사각형 별찍기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1; i <= b; i++) {
            for(int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            if(i < b) { //이 코드는 제외 가능
                System.out.println();
            }
        }
        
    	//////////////////////////////////////////
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
	}

}
