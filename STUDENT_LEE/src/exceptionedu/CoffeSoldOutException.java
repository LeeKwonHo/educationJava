package exceptionedu;

public class CoffeSoldOutException extends Exception{
	public CoffeSoldOutException() {}
	public CoffeSoldOutException(String message) {
		super(message);
	}
}
