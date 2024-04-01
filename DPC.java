public class DPC {
	public static void division(int num1, int num2) {
		try {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		} finally {
			System.out.println("Finally done.");
		}
		System.out.println("Finishing division.");
	}
	public static void main(String[] args) {
		DPC.division(10, 0);
		System.out.println("Finishing  main.");
	}
}