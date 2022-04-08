/*******************************************************************************
 *  Autor:Gonzalo Santiago García						   
 Fecha_de_Imicio: 7 de abril del 2022				   
 Fecha_de_actualización: 7 /04/2022  				   
 Descripción: calcula la factura del precio de una compra
  
 ******************************************************************************/

package ejercicio6;

public class Factura {
	private double iva= 16;
	private double subtotal= 200;
	//private double factura =15;
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	/*public double getFactura() {
		return factura;
	}
	public void setFactura(double factura) {
		this.factura = factura;
	}*/
	public double factu() {
		return subtotal+(subtotal/100)*iva;
	}
	public void imprimirFactu() {
		System.out.println("el total a pagar es: "+factu());
	}
	
	
}
