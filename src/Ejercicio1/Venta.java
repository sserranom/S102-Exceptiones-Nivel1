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
		
		for (Producto productos : venta) {
			System.out.println(productos.getNombre() + " ---> " + productos.getPrecio() + "€");
		}

	}
	
	public void calcularTotal() throws VendaBuidaException {
		
		if(venta.isEmpty()) {
			
			throw new VendaBuidaException();
			
		}else {
			
			for(Producto productos : venta) {
				
				precioTotal += productos.getPrecio();
			}
		}
		
		System.out.println("El precio total de la venta es: " + precioTotal);
	}
	
	
	public void removerProducto(List<Producto> productos, int item) {
		
		 if (item < 0 || item >= productos.size()) {
	            throw new IndexOutOfBoundsException("No se puede eliminar el producto, el item " + item + " no existe");
	        }
	        productos.remove(item);
	        System.out.println("Se ha eliminado el producto ");
	}
	


}
