package exercise;
//문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성
class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			sum += str.charAt(i)-'0';  //'0'을 빼줘야 int로 바뀌니까  
		}
		System.out.println("sum="+sum);
	}

}
