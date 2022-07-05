package ch05;

class ArrayEx11 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i<numArr.length;i++) {
			numArr[i] = (int)(Math.random() * 10);  //길이가 10인 numArr 배열에 0~9 값으로 초기화 
			System.out.print(numArr[i]);  
		}
		System.out.println();
		
		for(int i=0; i<numArr.length;i++) {  //numArr 배열에 저장된 각 숫자가 몇 번 반복하는지를 세어서 counter 배열에 담기 
			counter[numArr[i]]++;
		}
		for(int i=0; i<numArr.length;i++) {
			System.out.println(i+"의 개수 :"+counter[i]);
		}
	}

}
