package ch06;

class TvTest4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i< tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
	}

}

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
