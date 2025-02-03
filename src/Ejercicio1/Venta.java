package Ejercicio1;
import java.util.*;
public class Venta {
	
	
	//List<Producto> venta = new ArrayList<Producto>();	 
	
	private List<Producto> venta;
	private double precioTotal = 0;
	
	
	public Venta() {
		
		this.venta = new ArrayList<Producto>();
	}
	
	
	public void addProducto(Producto producto) {
		
		venta.add(producto);
		
	}
	
	
	public List<Producto> getProductos() {
		
	        return venta;
	}
	
	public void getVenta() {
		
		int indice = 1;
		for (Producto productos : venta) {
			
			System.out.println(indice + " " + productos.getNombre() + " ---> " + productos.getPrecio() + "€");
			indice++;
		}

	}
	
	public void calcularTotal() throws VendaBuidaException {
		
		if(venta.isEmpty()) {
			
			throw new VendaBuidaException("Para hacer una venta primero debes añadir productos.");
			
		}else {
			precioTotal = 0.0;
			for(Producto productos : venta) {
				
				precioTotal += productos.getPrecio();
			}
		}
		
		System.out.println("El precio total de la venta es: " + precioTotal + "€");
	}
	
	
	public void removerProducto(List<Producto> productos, int item) {
		
		 if (item < 0 || item >= productos.size()) {
			 
	            throw new IndexOutOfBoundsException("No se puede eliminar el producto, el item " + item + " no existe  IndexOutOfBoundsException ");
	        }
		 
	        productos.remove(item);
	        System.out.println("Se ha eliminado el producto ");
	}
	


}
