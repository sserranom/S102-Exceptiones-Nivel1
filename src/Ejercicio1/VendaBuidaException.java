package Ejercicio1;

public class VendaBuidaException extends Exception  {
	
	public VendaBuidaException() {
		
		super("Para hacer una venta primero debes añadir productos");
	}
	
	 public VendaBuidaException(String message) {
	        super(message);
	    }
	
	

}
	