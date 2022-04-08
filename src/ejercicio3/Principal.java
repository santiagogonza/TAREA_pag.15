/*******************************************************************************
 *  Autor:Gonzalo Santiago García						   
 Fecha_de_Imicio: 7 de abril del 2022				   
 Fecha_de_actualización: 7 /04/2022  				   
 Descripción: presenta los datos del nombre completo, la dirección y el número de teléfono en pantalla 
  
 ******************************************************************************/
package ejercicio3;

public class Principal {

	private static Nombre nombre;

	public static void main(String[] args) {

		nombre = new Nombre();
		nombre.imprimirNombre();

	}
}
