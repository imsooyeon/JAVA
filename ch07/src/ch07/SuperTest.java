package ch07;

class SuperTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 10;
}

class Child extends Parent {
//	int x =20;   //SuperTest2 예제 추가 
	
	void method() {
		System.out.println("x=" + x);  //10
		System.out.println("this.x=" + this.x); //10
		System.out.println("super.x=" + super.x);  //10
	}
}