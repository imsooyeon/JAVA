package exercise;

class Exercise6_8 {
	int kind; //iv
	int num;  //iv
	
	static int width; //cv
	static int height; //cv
	
	Exercise6_8(int k, int n) {
		kind = k; //k  lv
		num = n;  //n  lv
	}
	
	public static void main(String args[]) {
		Exercise6_8 card/*lv*/ = new Exercise6_8(1,1);
	}

}
