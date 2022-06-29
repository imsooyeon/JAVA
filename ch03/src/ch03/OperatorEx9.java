package ch03;

class OperatorEx9 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a="+a); //int타입 값 출
		System.out.println("b="+b); //1000000000000
	}

}
