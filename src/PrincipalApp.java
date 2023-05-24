
public class PrincipalApp {
	/**
	 * metodo main para llamar al metodo del objeto
	 * @param args
	 */
	public static void main (String []args) {
		int [] edades = {12,18,5,66,29,8,20,65};
		CalcularEdad examen = new CalcularEdad(edades); 
		
		examen.calcularEdades(edades);
	}
}
