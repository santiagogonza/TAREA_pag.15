/*******************************************************************************
 *  Autor:Gonzalo Santiago García						   
 Fecha_de_Imicio: 7 de abril del 2022				   
 Fecha_de_actualización: 7 /04/2022  				   
 Descripción: se define las variables de nom, dir, telcel de tipo String
 que tiene datos del nombre completo, la dirección y el número de teléfono 
  
 ******************************************************************************/

package ejercicio3;

public class Nombre {
//delcaración de las variables de tipo String
	private String nom = "Gonzalo Santiago Garcia";
	private String dir = "San Mateo Mixtepec";
	private String telcel = "9512376645";

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getTelcel() {
		return telcel;
	}

	public void setTelcel(String telcel) {
		this.telcel = telcel;
	}

	public void imprimirNombre() {
		System.out.println("El nombre es: " + getNom());
		System.out.println("la dirección es: " + getDir());
		System.out.println("el número de teléfono es: " + getTelcel());

	}
}
