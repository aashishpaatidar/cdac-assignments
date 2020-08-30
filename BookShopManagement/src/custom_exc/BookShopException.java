package custom_exc;

@SuppressWarnings("serial")
public class BookShopException extends Exception {
	
	public BookShopException(String msg) {
		super(msg);
	}

}
