package exercise;

class Exercise6_6 {
	static double getDistance(int x1, int y1, int x2, int y2) {
		double d;
		int xd, yd;
		
		yd = (int)Math.pow((y2-y1), 2);
		xd = (int)Math.pow((x2-x1), 2);
		d = Math.sqrt(yd+xd);
		return d;
	}

	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}

}
