public class MyException extends Exception {
	public MyException() {
		super();
	}
	public MyException(String msg) {
		super(msg);
	}
	public MyException(int i) {
		super(Integer.toString(i));
	}
}	
