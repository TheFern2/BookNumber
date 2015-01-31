
public class BookNumber {
	
	//private fields
	private String isbn;
	
	//Constructs
	public BookNumber(int d1, int d2, int d3, int d4,
			int d5, int d6, int d7, int d8, int d9){
			//Need to find a way to convert this to a string
		this.isbn = Integer.toString(d1) + Integer.toString(d2) + Integer.toString(d3)
					+ Integer.toString(d4) + Integer.toString(d5) + Integer.toString(d6)
					+ Integer.toString(d7) + Integer.toString(d8) + Integer.toString(d9);
		
	}
	
	//Boolean methods
	/**
	 * We check whether the digit is 10, or 13
	 * @param isbn
	 * @return
	 */
	public boolean isValid(String isbn){
		
		boolean isValid = false;
		
		if(isbn.length() == 9){
			isValid = true;
		}
		
		return isValid;
		
	}

	public String getIsbn() {
		return isbn;
	}

}
