/**
 * 
 */
package FiguraG;

/**
 * @author anton
 *
 */
public class tipoF {

	/**
	 * @param base
	 * @param altura
	 * @return Si la base y la altura son iguales, se trata de un cuadrado Si la
	 *         base y la altura son distintas, se trata de un rectángulo
	 */
	public static String tipoFigura(int base, int altura) {
		String figura;
		if (base == altura) {
			figura = "cuadrado";
		} else {
			figura = "rectángulo";
		}
		return figura;
	}

}
