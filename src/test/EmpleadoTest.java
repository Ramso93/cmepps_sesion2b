package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each");
	}

/**	calculoNominaBruta	*/
	/**	TipoEmpleado.Vendedor	*/
	//salario base será 2000 euros si el empleado tipo vendedor, y de 2500 euros si tipo encargado
	//prima de 100 euros si las ventas del mes son mayores o iguales que 1000 euros, y de 200 euros si fuese de 1500 euros o más
	//cada hora extra se pagará a 30 euros. 
	@Test
	void testCalculoNominaBruta_v1() {
		TipoEmpleado tipo= TipoEmpleado.Vendedor;
		float ventasMes=999;
		float horasExtras=0;
		
		float valorEsperado = 2000;
		float valorReal = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtras);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testCalculoNominaBruta_v2() {
		TipoEmpleado tipo= TipoEmpleado.Vendedor;
		float ventasMes=1000;
		float horasExtras=1;
		
		float valorEsperado = 2130;
		float valorReal = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtras);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testCalculoNominaBruta_v3() {
		TipoEmpleado tipo= TipoEmpleado.Vendedor;
		float ventasMes=1499;
		float horasExtras=2;
		
		float valorEsperado = 2160;
		float valorReal = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtras);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testCalculoNominaBruta_v4() {
		TipoEmpleado tipo= TipoEmpleado.Vendedor;
		float ventasMes=1500;
		float horasExtras=3;
		
		float valorEsperado = 2290;
		float valorReal = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtras);
		
		assertEquals(valorEsperado, valorReal);
	}
	
	/**	TipoEmpleado.Encargado	*/
	@Test
	void testCalculoNominaBruta_v5() {
		TipoEmpleado tipo= TipoEmpleado.Encargado;
		float ventasMes=999;
		float horasExtras=0;
		
		float valorEsperado = 2500;
		float valorReal = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtras);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testCalculoNominaBruta_v6() {
		TipoEmpleado tipo= TipoEmpleado.Encargado;
		float ventasMes=1000;
		float horasExtras=1;
		
		float valorEsperado = 2530;
		float valorReal = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtras);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testCalculoNominaBruta_v7() {
		TipoEmpleado tipo= TipoEmpleado.Encargado;
		float ventasMes=1499;
		float horasExtras=2;
		
		float valorEsperado = 2660;
		float valorReal = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtras);
		
		assertEquals(valorEsperado, valorReal);
	}
	//salario base será 2000 euros si el empleado tipo vendedor, y de 2500 euros si tipo encargado
	//prima de 100 euros si las ventas del mes son mayores o iguales que 1000 euros, y de 200 euros si fuese de 1500 euros o más
	//cada hora extra se pagará a 30 euros. 
	@Test
	void testCalculoNominaBruta_v8() {
		TipoEmpleado tipo= TipoEmpleado.Encargado;
		float ventasMes=1500;
		float horasExtras=3;
		
		float valorEsperado = 2790;
		float valorReal = Empleado.calculoNominaBruta(tipo, ventasMes, horasExtras);
		
		assertEquals(valorEsperado, valorReal);
	}
	/**	calculoNominaNeta	*/
	@Test
	void testCalculoNominaNeta_v1() {
		float nominaBruta=2099;
		float valorEsperado = 2099;
		float valorReal = Empleado.calculoNominaNeta(nominaBruta);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testCalculoNominaNeta_v2() {
		float nominaBruta=2100;
		float valorEsperado = 1785;
		float valorReal = Empleado.calculoNominaNeta(nominaBruta);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testCalculoNominaNeta_v3() {
		float nominaBruta=2499;
		float valorEsperado = (float) 2124.15;
		float valorReal = Empleado.calculoNominaNeta(nominaBruta);
		
		assertEquals(valorEsperado, valorReal);
	}
	@Test
	void testCalculoNominaNeta_v4() {
		float nominaBruta=2500;
		float valorEsperado = 2050;
		float valorReal = Empleado.calculoNominaNeta(nominaBruta);
		
		assertEquals(valorEsperado, valorReal);
	}

}
