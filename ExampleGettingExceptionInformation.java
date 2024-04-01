public class ExampleGettingExceptionInformation {
	private static void aux(int tam) {
		try { 
			int a[] = new int[tam]; 
			a[4] = 0; 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception: " + e.getMessage()); 
			e.printStackTrace(); 
		} 
	}
	public static void main(String[] args) {
		aux(2);
		System.out.println("End");
	}
}
