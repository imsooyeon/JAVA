package ch06;

class Tv{
	//tv 속성.
	String color;
	boolean power;
	int channel;
	
	//tv 기능(메서드 )
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

class TvTest {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println(t.channel);
	}

}
