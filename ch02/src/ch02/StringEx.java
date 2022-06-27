package ch02;

class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);       //Java
		System.out.println(str);        //Java8.0
		System.out.println(7 + " ");    //7 (String)
		System.out.println(" " + 7);    // 7 (String)
		System.out.println(7 + "");     //7 (String)
		System.out.println("" + 7);     //7 (String)
		System.out.println("" + "");    // (String)
		System.out.println(7 + 7 + ""); //14 (String)
		System.out.println("" + 7 + 8); //78 (String)
		
		//타입확인
		//System.out.println(변수.getClass().getName());
	}

}
