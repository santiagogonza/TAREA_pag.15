/**
 *  Autor:Gonzalo Santiago García						   
 Fecha_de_Imicio: 7 de abril del 2022				   
 Fecha_de_actualización: 7 /04/2022  				   
 Descripción: se muestra los resutados de cada uno las operaciones como
 la suma, resta, multiplicación y la división.
  
 */

package ejercicio1;

public class Principal {

	private static Calculadora calculadora;

	public static void main(String[] args) {
		//se declara el nuevo objeto con el operador new
		calculadora = new Calculadora();
	
		//hacemos la llamada del método imprir para que imprima los resultados calculados
		calculadora.imprimirResultado();

	}

}
