package ch02;

class SpecialCharEx {

	public static void main(String[] args) {
		System.out.println('\''); //'
		System.out.println("abc\t123\b456"); //abc	12456
		System.out.println('\n'); //(new line)
		System.out.println("\"Hello\""); //"Hello"
		System.out.println("c:\\"); //?? -> c:\ \*바로 뒤의 문자를 일반 문자열로 인식하게 된다. → 자바에서 \ 작성 시에는 \ 를 한번 더 붙여 \\ 으로 작성해야 한다.*/
	}

}
