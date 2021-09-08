package Step01;

public class Q1 {

	public static void main(String[] args) {
		String s ="a B z";
		int n = 4;
		
		String arr[] = s.split("");
		for(int j = 0; j < arr.length; j++) {
			if(arr[j].charAt(0) == ' ') {
				System.out.print(arr[j]);
			}else {
				char alpa = arr[j].charAt(0);
				int index = (int)(alpa)+n;
				if((int)alpa >= 65 && (int)alpa <= 90 && index > 90) {
					index = index -26;							
				}
				if((int)alpa >= 97 && (int)alpa <= 122 && index > 122) {
					index = index -26;				
				}
				alpa = (char)(index);
				System.out.print(String.valueOf(alpa));
			}
		}
	}

}
