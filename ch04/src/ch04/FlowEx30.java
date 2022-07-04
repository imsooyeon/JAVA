package ch04;

class FlowEx30 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;  //break문이 수행되면 while문 벗어
			++i;
			sum += i;
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}

}
