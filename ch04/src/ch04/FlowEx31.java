package ch04;

class FlowEx31 {

	public static void main(String[] args) {
		for(int i=0;i <=10;i++) {
			if (i%3==0)
				continue;
			System.out.println(i); //1~10 사이의 숫자를 출력하되 3의 배수는 제외 
		}
	}

}
