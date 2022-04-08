
/*******************************************************************************
 Autor:Gonzalo Santiago García						   
 Fecha_de_Incio: 7 de abril del 2022				   
 Fecha_de_actualización: 7 /04/2022  				   
 Descripción: se crean las variables y le asignamos los valores se
 crean los metos con los datos correspondiente y por último realiza
  la suma, resta, multiplicación y la división.
  
 ******************************************************************************/
package ejercicio1;

public class Calculadora {
	// definimos las variables y le asignamos los valores correspondientes
	private double x = 144;
	private double y = 999;
	 
	 // se declara los párametros de cada uuno de los métodos
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double suma() {
		return this.x + this.y;

	}

	public double resta() {
		return this.x - this.y;

	}

	public double multiplicacion() {
		return this.x * this.y;

	}

	public double division() {
		return this.x / this.y;

	}

	// declaramos el metodo imprimir que en la clase principal se utilizará
	public void imprimirResultado() {
		System.out.println("la suma es: " + suma());
		System.out.println("la resta es: " + resta());
		System.out.println("la multiplicación es: " + multiplicacion());
		System.out.println("la división es: " + division());

	}
}