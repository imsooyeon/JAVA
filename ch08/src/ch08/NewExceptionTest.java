package ch08;

class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("error message:"+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하세요.");
		} catch (MemoryException me) {
			System.out.println("error message:"+me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException, MemoryException {
		 if(!enoughSpace())
			 throw new SpaceException("설치할 공간이 부족~!!");
		 if(!enoughMemory())
			 throw new MemoryException("메모리 부족~!!");
	 }
	 
	 static void copyFiles() {/*파일들을 복사하는 코드.*/}
	 static void deleteTempFiles() {/*임시파일들을 삭제하는 코드.*/}
	 
	 static boolean enoughSpace() {
		 return false;
	 }
	 
	 static boolean enoughMemory() {
		 return true;
	 }
}

class SpaceException extends Exception {
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg){
		super(msg);
	}
}
 