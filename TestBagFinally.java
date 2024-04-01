public class TestBagFinally {
	public static void main(String[] args) {
		try {  
			int bb = Integer.parseInt(args[0]);
			int wb = Integer.parseInt(args[1]);
			// ...
		} catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("Use: TestBag <Int> <Int>"); 
		} catch (NumberFormatException e) { 
			System.out.println("Both arguments must be integer numbers"); 
		} finally {
			System.out.println("The program execution continues here"); 
		}
		System.out.println("And then it continues here");  
	}
}
