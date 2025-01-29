****Enunciado***

Crea una clase llamada "Producto" con los atributos nombre y precio, y otra clase llamada "Venta". Esta clase tiene por atributos una colección de productos y el precio total de la venta.
La clase "Venta", tiene un método llamado calcularTotal() que lanza la excepción personalizada "VentaBuidaException" y muestra por pantalla "Para hacer una venta primero debes añadir productos"
si la colección de productos está vacía. Si la colección tiene productos, entonces debe recorrer la colección y guardar la suma de todos los precios de los productos en el atributo precio total de la venta.
La excepción personalizada "VentaVacidaException" debe ser hija de la clase Exception. A su constructor debemos pasarle el mensaje “Para hacer una venta primero debes añadir productos” y cuando capturamos la excepción,
debemos mostrarlo por pantalla con el método getMessage() de la excepción.
Escribe el código necesario para generar y capturar una excepción de tipo "IndexOutOfBoundsException".
