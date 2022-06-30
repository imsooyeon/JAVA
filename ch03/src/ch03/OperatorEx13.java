package ch03;

class OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';
		
//		char c2 = c1+1;
		char c2 = 'a' + 1; //a의 유니코드 98 98+1=99 를 문자로 변환하면 b
		
		System.out.println(c2);
	}

}
