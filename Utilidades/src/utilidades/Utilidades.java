package utilidades;

// Segundo commit

/**
 * Esta clase contiene varias utilidades para comprobar el formato de cadenas de texto.
 * 
 * @author Pedro Berrueco
 */
public class Utilidades {

	/**
	 * Comprueba si una cadena contiene un entero.
	 * 
	 * @param s Cadena a comprobar
	 * @return Si la cadena es un entero
	 */
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Comprueba si una cadena contiene una lista separada por comas.
	 * 
	 * @param s Cadena a comprobar
	 * @return Si la cadena es una lista
	 */
	public static boolean isList(String s) {
		String[] lst = s.split(",");
		if (lst.length > 0) {
			return true;
		}
		return false;
	}
	
/**
 * Convierte una cadena a may�sculas.
 * 
 * @param s Cadena a convertir
 * @return Cadena convertida a may�sculas
 */
public static String toUpperCase(String s) {
	return s.toUpperCase();
}

/**
 * Convierte una cadena a un array de caracteres.
 * 
 * @param s Cadena a convertir
 * @return Array de caracteres
 */
public static char[] toCharArray(String s) {
	return s.toCharArray();
}
	
	/**
	 * Comprueba si una cadena contiene s�lo letras.
	 * 
	 * @param s Cadena a comprobar
	 * @return Si la cadena contiene s�lo letras
	 */
	public static boolean isAlpha(String s) {
		return s.matches("[a-zA-Z]+");
	}
}