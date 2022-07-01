package ch04;

import java.util.*;
class FlowEx11 {

	public static void main(String[] args) {
		System.out.print("주민번호 입력(000000-0000000)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7);
		
		switch(gender) {
			case '1': case '3':
				switch(gender) {
					case '1':
						System.out.println("man born before 2000");
						break;
					case '3':
						System.out.println("man born after 2000");
				}
				break;
			case '2': case '4':
				switch(gender) {
					case '2':
						System.out.println("woman born before 2000");
						break;
					case '4':
						System.out.println("woman born after 2000");
				}
				break;
			default :
				System.out.println("invalid");
		}
		
	}

}
