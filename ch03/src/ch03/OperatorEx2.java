package ch03;

class OperatorEx2 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		j=i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j); //j=i++; 실행 후, i=6, j=5 참조하여 대입 후 증가 
		
		i=5;
		j=0;
		
		j=++i;
		System.out.println("j=++i; 실행 후, i=" + i +", j=" + j); //j=++i; 실행 후, i=6, j=6; 증가 후에 참조하여 대입 
	}

}
