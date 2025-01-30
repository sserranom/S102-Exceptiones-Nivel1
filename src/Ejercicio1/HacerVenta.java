package Ejercicio1;

//import java.util.List;

public class HacerVenta {

	public static void main(String[] args) {

		Venta venta = new Venta();

		venta.addProducto(new Producto("Arroz", 1.20));
		venta.addProducto(new Producto("Aceite", 8.20));
		venta.addProducto(new Producto("Azucar", 0.80));
		
		
		
		venta.getVenta();
		
		try {
			venta.calcularTotal();
		}catch(VendaBuidaException e){
			
			System.out.println(e.getMessage());
			
		}
		
		
		
		/*Codigo para genrar y capturar una exepcion de tipo IndexOutOfBoundsException, cuando intento eliminar un producto 
		desde un indice que no existe*/
		
		System.out.println("\nCódigo para generar y capturar la excepcion de tipo IndexOutOfBoundsException \n");
		
		  try {
	            venta.removerProducto(venta.getProductos(), 6); 
	        } catch (IndexOutOfBoundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
		  
		  System.out.println("\n");
		  
		  venta.getVenta();
	}

}
