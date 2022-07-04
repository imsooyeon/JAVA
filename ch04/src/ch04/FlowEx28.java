package ch04;

import java.util.*;

class FlowEx28 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) +1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1 ~ 100 정수 입력:");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수 입력");
			} else if(input < answer) {
				System.out.println("더 큰 수 입력");
			}
		} while(input!=answer);
		
		System.out.println("정답 ");
	}

}
