package ch02;

class PrintfEx1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;	//long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.printf("b=%d%n", b);  //b=1
		System.out.printf("s=%d%n", s); //s=2
		System.out.printf("c=%c, %d %n", c, (int)c); //c='A',아스키코드 A를 10진수로 바꾼 수 
		System.out.printf("finger=[%5d]%n", finger); //finger=[   10]
		System.out.printf("finger=[%-5d]%n", finger); //finger=[10   ] 
		System.out.printf("finger=[%05d]%n", finger); //finger=[00010]
		System.out.printf("big=%d%n", big); //big = 100000000000
		System.out.printf("hex=%#x%n", hex); //hex= 모르겠, -> %x, %o에 #를 사용하면 접두사 '0x'와 0이 각각 붙는다. #x 는 소문자 #X는 대문
		System.out.printf("octNum=%o, %d%n", octNum, octNum); //octNum=10, octNum을 10진수로 바꾼 수 
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); //hexNum=10, hexNum을 10진수로 바꾼 수 
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); /*binNum=10, binNum을 10진수로 바꾼 수 , 
		2진수로 바꾸는'지시자'가 없기 때문에 Integer.toBinaryString을 써줘야 함 */
		
	}

}
