/*******************************************************************************
 *  Autor:Gonzalo Santiago García						   
 Fecha_de_Imicio: 7 de abril del 2022				   
 Fecha_de_actualización: 7 /04/2022  				   
 Descripción: realiza la conversión de euros a pesos asignando la cantidad que se desea convertir
  
 ******************************************************************************/
package ejercicio5;

public class Conversion2 {
	private double pesos = 2;
	private double euros= 0.046;
	public double getPesos() {
		return pesos;
	}
	public void setPesos(double pesos) {
		this.pesos = pesos;
	}
	public double getEuros() {
		return euros;
	}
	public void setEuros(double euros) {
		this.euros = euros;
	}
	public double convert() {
		return this.pesos*this.euros;
	}
	
	public void imprimirConvert() {
	System.out.println("la conversión de pesos a euros es: "+convert());
	}
}
