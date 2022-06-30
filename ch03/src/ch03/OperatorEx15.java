package ch03;

class OperatorEx15 {

	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32); //a의 유니코드 97-32=65 -> A
		System.out.println(upperCase);
	}

}
