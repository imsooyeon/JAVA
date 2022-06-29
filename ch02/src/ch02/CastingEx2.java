package ch02;

class CastingEx2 {

	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i; //10
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); //[int -> byte] i=10 -> b=10
		
		i = 300; 
		b = (byte)i;
//		System.out.println(b); 44
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); //[int -> byte] i=300 -> b=44
//		
		b = 10;
		i = (int)b;
//		System.out.println(i); 10
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); //[int -> byte] b=10 -> i=10
		
		b = -2;
		i = (int)b;
//		System.out.println(i); -2
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); //[byte -> int] b=-2 -> i=-2
//		
		System.out.println("i="+Integer.toBinaryString(i)); //i가 2진수로 출
	}

}
