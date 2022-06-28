package ch02;

class CharToCode {

	public static void main(String[] args) {
		char ch = 'A';
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#X) %n", ch, code, code); //A=65(65를 16진수로 바꾼 수 )
		
		char hch = '가';
		System.out.printf("%c=%d(%#X) %n", hch, (int)hch, (int)hch); //가='가'의유니코드(->16진수로 바꾼 수 )
	}

}
