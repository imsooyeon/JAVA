package ch05;

class ArrayEx8 {

	public static void main(String[] args) {
		int[] ball = new int[45]; //45개 정수가 들어갈 배열 선언 
		
		for(int i=0; i<ball.length;i++)
			ball[i] = i+1; //배열 0번째부터 차례로 숫자 넣기 
		
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i<6; i++) {  //0번째부터 5번째 요소까지만 바꾼다 
			j = (int)(Math.random()*45); //0~44범위의 임의의 값을 얻는다 
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}

}
