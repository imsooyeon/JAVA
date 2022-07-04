package ch04;

class FlowEx33 {

	public static void main(String[] args) {
		Loop1 : for(int i=2; i<=9; i++){
			for(int j=1; j<=9; j++) {
				if(j==5)
					break Loop1;
//					break;
//					continue Loop1;
//					continue;          
				    /*2개 break문과 2개 continue문(총4개) 중 하나 선택하고 나머지 주석 처 */
				System.out.println(i+"*"+j +"="+ i*j);
			}
			System.out.println();
		}
	}

}
