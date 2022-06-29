package ch02;

class FloatToBinEx {

	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f); //9.123457
		System.out.printf("%X%n",i); //f를 int로 바꾸고 16진수로 바꾼 수 
	}

}
