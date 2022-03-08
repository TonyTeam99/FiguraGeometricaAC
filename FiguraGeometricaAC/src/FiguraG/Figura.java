package FiguraG;

/**
 * 
 */

/**
 * @author anton
 *
 */

import java.util.Scanner;

public class Figura {
	private static Scanner teclado;

	public static void main(String[] args) {
		/*
		 * Queremos averiguar si la figura introducida es un cuadrado o un rectángulo y
		 * mostrar su perímetro.
		 */
		// Introducimos la base y altura que se pide por teclado
		int base, altura;
		String figura;
		teclado = new Scanner(System.in);
		System.out.print("Introduce la base de la figura: ");
		base = teclado.nextInt();
		System.out.print("Introduce la altura de la figura: ");
		altura = teclado.nextInt();
		// Se llama al método para comprobar si es un cuadrado o rectángulo
		figura = tipoF.tipoFigura(base, altura);
		// Se calcula el perímetro
		int perimetro = 2 * base + 2 * altura;
		System.out.println("La figura es un " + figura + " y su perímetro es: " + perimetro);
	}

	/**
	 * @param base
	 * @param altura
	 * @return
	 * @deprecated Use {@link tipoF#tipoFigura(int,int)} instead Se llama al método
	 *             para comprobar que tipo de figura es
	 */
	public static String tipoFigura(int base, int altura) {
		return tipoF.tipoFigura(base, altura);
	}
}
