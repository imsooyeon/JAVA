package ch04;
import java.util.*;

class FlowEx8 {

	public static void main(String[] args) {
		System.out.print("주민번호입력(000000-0000000)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7); //입력 받은 번호의 8번째 문자를 gender에 저장
		
		switch(gender) {
			case '1': case '3':
				System.out.println("man");
				break;
			case '2': case '4':
				System.out.println("woman");
				break;
			default:
				System.out.println("invalid");
		}
	}

}
