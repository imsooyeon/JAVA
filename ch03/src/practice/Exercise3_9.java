package practice;

class Exercise3_9 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (('a' <= ch && ch <= 'z')||('A'<=ch && ch<= 'Z')) /*문자ch는 대문자 또는 소문자 */ || ('0' <= ch && ch <= '9')/*숫자 */;
		System.out.println(b); //true
	}

}
