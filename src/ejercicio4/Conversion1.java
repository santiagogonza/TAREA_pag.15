/*******************************************************************************
 *  Autor:Gonzalo Santiago García						   
 Fecha_de_Imicio: 7 de abril del 2022				   
 Fecha_de_actualización: 7 /04/2022  				   
 Descripción: realiza la conversión de pesos a euros asignando la cantidad que se desea convertir
  
 ******************************************************************************/


package ejercicio4;

public class Conversion1 {
	// declaramos las variables de tipo double ya asignandole los valores correspondientes 
	private double euro = 100;
	private double pesos= 21.91;
	
	public double getEuro() {
		return euro;
	}
	public void setEuro(double euro) {
		this.euro = euro;
	}
	public double getPesos() {
		return pesos;
	}
	public void setPesos(double pesos) {
		this.pesos = pesos;
	}
	 public double conver() {
		 return this.euro * this.pesos;
	 }
	 public void imprimirConver() {
		 System.out.println("la conversión de euros a pesos es: "+conver());
	 }

}
