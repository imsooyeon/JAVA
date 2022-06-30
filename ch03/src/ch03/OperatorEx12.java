package ch03;

class OperatorEx12 {

	public static void main(String[] args) {
		char c1 = 'a'; 
		char c2 = c1;
		char c3 = ' ';
		
		int i = c1 + 1; //i=97+1=98
		
		c3 = (char)(c1 + 1); 
		c2++; //98
		c2++; //99
		
		System.out.println("i=" + i); //i=98
		System.out.println("c2=" + c2); //c2=c 99를 문자로 변환 
		System.out.println("c3=" + c3); //c3=b 98을 문자로 변환 
	}

}
