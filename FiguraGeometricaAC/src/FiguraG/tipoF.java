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
	 * @return
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
