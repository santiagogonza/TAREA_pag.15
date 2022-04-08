/*******************************************************************************
 *  Autor:Gonzalo Santiago García						   
 Fecha_de_Inicio: 7 de abril del 2022				   
 Fecha_de_actualización: 7 /04/2022  				   
 Descripción: se declara un dato de tipo string que se le asigna el  nombre completo en este caso
 mi nombre 
  
 ******************************************************************************/
package ejercicio2;

public class Nombre {
	private String nom = "Gonzalo Santiago Garcia";

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void imprimirNombre() {
		System.out.println("El nombre es: " + getNom());

	}
}
