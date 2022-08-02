package exercise;

class Exercise7_14 {

	public static void main(String[] args) {
		SutdaCard card = new SutdaCard(1, true);
	}

}

class SutdaCard3 {
	final int NUM;
	final boolean IS_KWANG;
	
	SutdaCard3() {
	this(1, true);
	}
	
	SutdaCard3(int num, boolean isKwang) {
	this.NUM = num;
	this.IS_KWANG = isKwang;
	}
	
	public String toString() {
	return NUM + ( IS_KWANG ? "K":"");
}
}