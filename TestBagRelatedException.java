public class TestBagRelatedException {
	public static void main(String[] args) {
		try {  
			int bb = Integer.parseInt(args[0]);
			int wb = Integer.parseInt(args[1]);
			// ...
		} catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("Use: TestBag <Int> <Int>"); 
		} catch (NumberFormatException ee) { 
			System.out.println("Both arguments must be integer numbers"); 
		} catch (RuntimeException e) { 
			System.out.println("A different RuntimeException"); 
		} finally {
			System.out.println("The program execution continues here"); 
		}
	}
}
