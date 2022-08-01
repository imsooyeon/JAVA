package exercise;

class Exercise6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));

	}

}

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		double d;
		int xd, yd;
		
		yd = (int)Math.pow((y1-y), 2);
		xd = (int)Math.pow((x1-x), 2);
		d = Math.sqrt(yd+xd);
		return d;
	}
	/*
	(1) 인스턴스메서드 getDistance를 작성하시오.
	*/
}