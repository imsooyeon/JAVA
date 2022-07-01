package ch04;

import java.util.Scanner;

class FlowEx2 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자 입력>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("0");
		}
		
		if(input!=0) 
			System.out.println("0아님 ");
			System.out.printf("입력한 숫자는 %d", input);
		
	}

}
