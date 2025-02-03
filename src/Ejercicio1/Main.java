package Ejercicio1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		GestionarVenta hacerVenta = new GestionarVenta();
		Scanner input = new Scanner(System.in);
		
		System.out.println("*********Elija la Operacion que desea Realizar***********");
		System.out.println(" 1. Agregar Productos "
							+ "\n 2. Realizar una Venta. genera excepcion VendaBuidaException"
							+ " \n 3. Generar Excepcion IndexOutOfBoundsException"  );
		
		
		int option = input.nextInt();
		switch(option) {
		
			case 1:
				
				hacerVenta.agregarProductos();
				break;	 
									
			case 2:
				
				hacerVenta.realizarVenta();
			break;
				
			case 3:
				
				hacerVenta.generarExcepcionIndexOutOfBounds();
			  
		 }
					
	}
		
}
