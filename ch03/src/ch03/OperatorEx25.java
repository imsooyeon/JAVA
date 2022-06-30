package ch03;

import java.util.*;
class OperatorEx25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자 하나 입력>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);  //charAt():String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
		
		if('0'<= ch && ch <= '9') {
			System.out.printf("숫자%n");
		}
		
		if(('a'<= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) {
			System.out.printf("문자%n");
		}
	}

}
