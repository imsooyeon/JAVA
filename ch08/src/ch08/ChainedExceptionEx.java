package ch08;

class ChainedExceptionEx {

	public static void main(String[] args) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch(SpaceException se) {
			InstallException ie = new InstallException("설치 중 예외발생.");
			ie.initCause(se);
			throw ie;
		} catch(MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생.");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간 부족.");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("메모리 부족.");
//			throw new RuntimeException(new MemoryException("메모리 부족."));
		}
	}
	
	static void copyFiles() {/*파일 복사 코드.*/}
	static void deleteTempFiles() {/*임시저장 파일 삭제 코드.*/}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
}

class InstallException extends Exception {
	InstallException(String msg){
		super(msg);
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
