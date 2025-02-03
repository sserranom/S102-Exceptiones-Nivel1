package Ejercicio1;
import java.util.Scanner;

public class GestionarVenta {
	private Venta venta;
	private Scanner input;
	
	public GestionarVenta() {
		this.venta = new Venta();
		this.input = new Scanner(System.in);
	}
	
	public void realizarVenta() {
        try {
            venta.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }
    }
	
	public void agregarProductos() {
	    String seguir = "s";

	      while (seguir.equalsIgnoreCase("s")) {
	         System.out.println("Agregue el nombre del producto: ");
	         String nombre = input.nextLine();
	         System.out.println("Introduzca el precio del producto: ");
	         double precio = input.nextDouble();
	         input.nextLine(); 

	         venta.addProducto(new Producto(nombre, precio));

	         System.out.println("¿Desea agregar más productos? (S/N) ");
	         seguir = input.nextLine();
	      }

	        System.out.println("Productos agregados: ");
	        venta.getVenta();
	        System.out.println("\n¿Desea realizar la venta? (S/N)");
	        seguir = input.nextLine();

	        if (seguir.equalsIgnoreCase("s")) {
	            realizarVenta();
	        }
	 }
	
	
	 public void generarExcepcionIndexOutOfBounds() {
	        System.out.println("\n Intentaremos eliminar un producto con un índice fuera de la lista\n");

	        venta.addProducto(new Producto("Aceite", 8.20));
	        venta.addProducto(new Producto("Arroz", 1.80));
	        venta.addProducto(new Producto("Azúcar", 0.80));
	        venta.addProducto(new Producto("Pollo", 7.00));

	        venta.getVenta();

	        System.out.println("Elija el producto que desea eliminar: al seleccionar un producto que no existe generará la exception ");
	        int indice = input.nextInt();

	        try {
	            venta.removerProducto(venta.getProductos(), indice);
	        } catch (IndexOutOfBoundsException e) {
	            System.out.println( e.getMessage());
	        }
	    }
	  
}
