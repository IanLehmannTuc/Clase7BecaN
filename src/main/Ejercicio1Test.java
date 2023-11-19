package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class Ejercicio1Test {

	@Test
	void testCostoFinalDescuentoFijo() {
		
		Producto producto1 = new Producto("Arroz", "8745F", 2000);
		Producto producto2 = new Producto("Atun", "8574S", 2000);
		Producto producto3 = new Producto("Sal", "8574H", 2000);
		
		Carrito carrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-10-14T18:03:00"));
		
		DescuentoFijo desFijo = new DescuentoFijo(2000);
		
		double valorFinal = carrito.costoFinal(desFijo);
		System.out.println(valorFinal);
		assertEquals(valorFinal, 4000);
	}
	
	@Test
	void testCostoFinalDescuentoPorcentaje() {
		
		Producto producto1 = new Producto("Arroz", "8745F", 2000);
		Producto producto2 = new Producto("Atun", "8574S", 2000);
		Producto producto3 = new Producto("Sal", "8574H", 2000);
		
		Carrito carrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-10-14T18:03:00"));
		
		DescuentoPorcentaje desPorcentaje = new DescuentoPorcentaje(0.50F);
		
		double valorFinal = carrito.costoFinal(desPorcentaje);
		System.out.println(valorFinal);
		assertEquals(valorFinal, 3000);
	}
	
	@Test
	void testCostoFinalDescuentoPorcentajeConTope() {
		
		Producto producto1 = new Producto("Arroz", "8745F", 2000);
		Producto producto2 = new Producto("Atun", "8574S", 2000);
		Producto producto3 = new Producto("Sal", "8574H", 2000);
		
		Carrito carrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-10-14T18:03:00"));
		
		DescuentoPorcentajeConTope desConTope = new DescuentoPorcentajeConTope(0.50F);
		desConTope.setValor(0.20F);
		double valorFinal = carrito.costoFinal(desConTope);
		System.out.println(valorFinal);
		assertEquals(valorFinal, 6000);
	}

}
