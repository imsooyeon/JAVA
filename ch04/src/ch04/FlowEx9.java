package ch04;

import java.util.*;

class FlowEx9 {

	public static void main(String[] args) {
		char grade = ' ';
		
		System.out.print("score(1~100) >");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		switch(score) {
			case 100: case 99:
				grade = 'A';
				break;
			case 89: case 88:
				grade = 'B';
				break;
			case 79: case 78:
				grade = 'C';
				break;
			default :
				grade = 'F';
		}
		System.out.println("grade =>" + grade + "!!");
	}

}
