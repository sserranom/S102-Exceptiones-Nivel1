package Ejercicio1;

import java.util.*;

public class HacerVenta {

	public static void main(String[] args) {
		int option;
		Scanner input = new Scanner(System.in);
		
		System.out.println("*********Elija la Operacion que desea Realizar***********");
		System.out.println("1. Agregar Productos "
							+ "\n 2.  Realizar una Venta. genera excepcion VendaBuidaException"
							+ " \n 3. Generar Excepcion IndexOutOfBoundsException"  );
		
		option = input.nextInt();
		Venta venta = new Venta();
		switch(option) {
		
			case 1:
				String seguir = "s";
				
				while(seguir.equalsIgnoreCase("s")) {
					
						System.out.println("Agrege el nombre del proucto: ");
						String nombre = input.next();		
						System.out.println("Introduzca el precio del producto: ");
						double precio = input.nextDouble();
	
						venta.addProducto(new Producto(nombre, precio));
		//				venta.addProducto(new Producto("Aceite", 8.20));
		//				venta.addProducto(new Producto("Azucar", 0.80));
					
						System.out.println("¿Desea agregar mas productos? S/N ");
						seguir = input.next();
					 
					
				}
				
				System.out.println("Productos agregados: "  );
				venta.getVenta();
				System.out.println();
					
				System.out.println("¿Desea Realizar la venta? S/N");
				
				seguir.equalsIgnoreCase("s");
				seguir = input.next();
						
				try {
							
					venta.calcularTotal();
							
				}catch(VendaBuidaException e){
							
					System.out.println(e.getMessage());
							
				}		
				
			break;
			
				
				
				
			case 2:
				
				try {
					
					venta.calcularTotal();
					
				}catch(VendaBuidaException e){
					
					System.out.println(e.getMessage());
					
				}
				
			break;
				
				
			
				
			case 3:
				
				/*Codigo para genrar y capturar una exepcion de tipo IndexOutOfBoundsException, cuando intento eliminar un producto 
				desde un indice que no existe*/
				
				System.out.println("\nCódigo para generar y capturar la excepcion de tipo IndexOutOfBoundsException cuando intentamos "
					+ "eliminar un producto que no existe \n");
			
				venta.addProducto(new Producto("Aceite", 8.20));
				venta.addProducto(new Producto("Arroz", 1.80));
				venta.addProducto(new Producto("Aucar", 0.80));
				venta.addProducto(new Producto("pollo", 7.00));
					
				venta.getVenta();
				
				System.out.println("Elija el producto que desea eliminar: \n Para generar la excepcion debemos elegir un producto que no este en la lista");
				int indice = input.nextInt();
				
			
				try {
				  	
					venta.removerProducto(venta.getProductos(), indice); 
					
		        } catch (IndexOutOfBoundsException e) {
		        	
		            System.out.println("Error: " + e.getMessage());
		        }
	  
		  break;
			  
		 }
			
			
	}
		
		
			
			
		
		
		
	
		
		
		


}
