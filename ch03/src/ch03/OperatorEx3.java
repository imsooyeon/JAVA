package ch03;

class OperatorEx3 {

	public static void main(String[] args) {
		int i = 5, j=5;
		System.out.println(i++); //6  -> 5 참조하여 대입 후 증가!!!
		System.out.println(++j); //6
		System.out.println("i = " + i +", j = " + j); //i=6, j=6
	}

}
