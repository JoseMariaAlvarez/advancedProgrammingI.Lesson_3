public class ExampleThrowingExceptions {
	public static void division(int num1, int num2) throws MyException {
		if (num2 == 0) {
			throw new MyException(num1);
		}
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}
	public static void main(String[] args) {
		try {
			division(10, 0);
			System.out.println("Division done.");
		} catch (MyException e) {
			System.out.println("Number " + e.getMessage());
		} finally {
			System.out.println("Finally done.");
		}
	}
}