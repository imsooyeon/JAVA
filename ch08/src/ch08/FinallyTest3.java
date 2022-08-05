package ch08;

class FinallyTest3 {

	public static void main(String[] args) {
		//method1()은 static메서드이므로 인스턴스 생성없이 직접 호출 가능.
		FinallyTest3.method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아옴.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출됨.");
			return; //현재 실행 중인 메서드를 종료.
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 finally 블럭이 실행됨.");
		}
	}

}
