package ch08;

class ExceptionEx14 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("메인 메서드에서 예외 처리 완료.");
		    e.printStackTrace();
		}
	}
	
	static void method1() throws Exception {
		throw new Exception();
	}

}
