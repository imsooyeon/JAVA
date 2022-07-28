package ch07;

class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channeDown() { --channel;}
}

class CaptionTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if (caption) {  //캡션 상태가 on일 때만 text를 보여줌  
			System.out.println(text);
		}
	}
}

class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");  //이렇게 해도 텍스트 안 보여짐  
		ctv.caption = true;   //캡션이 true니까 텍스트 보여짐  
		ctv.displayCaption("Hello, World");  //텍스트 보여짐  
	}

}
