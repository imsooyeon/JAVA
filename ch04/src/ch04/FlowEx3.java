package ch04;

import java.util.*;

class FlowEx3 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력:");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input==0) {
			System.out.println("입력숫자0");
		} else {
			System.out.println("입력숫자0아님 ");
		}
	}

}
