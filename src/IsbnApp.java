
public class IsbnApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BookNumber mybook = new BookNumber(0, 2, 0, 5, 0, 8, 0, 0, 5);
		System.out.println(mybook.getIsbn());
		
		System.out.println(mybook.isValid(mybook.getIsbn()));
		System.out.println("Test 123");
	}

}
