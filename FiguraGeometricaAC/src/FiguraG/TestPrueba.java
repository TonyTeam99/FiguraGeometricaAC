/**
 * 
 */
package FiguraG;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author anton
 *
 */
public class TestPrueba {

	// Comprobamos que la base no puede ser negativa
	@Test
	public void testBaseNegativa() {
		String resultado = tipoF.tipoFigura(-1, 1);
		String esperado = "No puede ser negativa la base";
		assertEquals(resultado, esperado);
	}

	// Comprobamos que la altura no puede ser negativa
	@Test
	public void testAlturaNegativa() {
		String resultado = tipoF.tipoFigura(1, -1);
		String esperado = "No puede ser negativa la altura";
		assertEquals(resultado, esperado);
	}

	// Comprobamos que la altura no puede ser 0
	@Test
	public void testAlturaCero() {
		String resultado = tipoF.tipoFigura(1, 0);
		String esperado = "No puede ser 0 la altura";
		assertEquals(resultado, esperado);
	}

	// Comprobamos que la base no puede ser 0
	@Test
	public void testBaseCero() {
		String resultado = tipoF.tipoFigura(0, 1);
		String esperado = "No puede ser 0 la base";
		assertEquals(resultado, esperado);
	}

	// Comprobamos que puede ser un cuadrado
	@Test
	public void testCuadrado() {
		String resultado = tipoF.tipoFigura(1, 1);
		String esperado = "Cuadrado";
		assertEquals(resultado, esperado);
	}

	// Comprobamos que puede ser un rectángulo
	@Test
	public void testRectangulo() {
		String resultado = tipoF.tipoFigura(1, 1);
		String esperado = "Rectángulo";
		assertEquals(resultado, esperado);
	}

}
