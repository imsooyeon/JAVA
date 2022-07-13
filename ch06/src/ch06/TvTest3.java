package ch06;

//class Tv{
////tv 속성.
//String color;
//boolean power;
//int channel;
//
////tv 기능(메서드 )
//void power() {power = !power;}
//void channelUp() { ++channel;}
//void channelDown() {--channel;}
//}

class TvTest3 {

public static void main(String[] args) {
	Tv t1 = new Tv();
	Tv t2 = new Tv();
	System.out.println("t1.channel값은 "+t1.channel+"입니다.");
	System.out.println("t2.channel값은 "+t2.channel+"입니다.");
	
	t2 = t1;
	t1.channel = 7;
	System.out.println("t1.channel값 변경 ");
	
	System.out.println("t1.channel값은 "+t1.channel+"입니다.");
	System.out.println("t2.channel값은 "+t2.channel+"입니다.");
}

}