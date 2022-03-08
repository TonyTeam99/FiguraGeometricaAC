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

	@Test
	public void testBaseNegativa() {
		String resultado = tipoF.tipoFigura(-1, 1);
		String esperado = "No puede ser negativa la base";
		assertEquals(resultado, esperado);
	}

	@Test
	public void testAlturaNegativa() {
		String resultado = tipoF.tipoFigura(1, -1);
		String esperado = "No puede ser negativa la altura";
		assertEquals(resultado, esperado);
	}

	@Test
	public void testAlturaCero() {
		String resultado = tipoF.tipoFigura(1, 0);
		String esperado = "No puede ser negativa la altura";
		assertEquals(resultado, esperado);
	}

	@Test
	public void testBaseCero() {
		String resultado = tipoF.tipoFigura(0, 1);
		String esperado = "No puede ser negativa la altura";
		assertEquals(resultado, esperado);
	}

	@Test
	public void testCuadrado() {
		String resultado = tipoF.tipoFigura(1, 1);
		String esperado = "Cuadrado";
		assertEquals(resultado, esperado);
	}

	@Test
	public void testRectangulo() {
		String resultado = tipoF.tipoFigura(1, 1);
		String esperado = "Rectángulo";
		assertEquals(resultado, esperado);
	}

}
