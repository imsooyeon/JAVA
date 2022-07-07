package exercise;

class Exercise4_12 {

	public static void main(String[] args) {
		//3개씩 끊어서 가로 출력하는거 모르겠.  답 확인 함..
		for(int i=1;i<10;i++) {
			for(int j=1; j<4;j++) {
				int x = j+1+(i-1)/3*3;  //<-이걸 어떻게 생각??
				int y = i%3==0? 3:i%3;
				
				if(x>9)
					break;
				
				System.out.print(x+"*"+y+"="+x*y+"\t");
				
			}
			System.out.println();
			if(i%3==0) System.out.println();
		}
	}

}
