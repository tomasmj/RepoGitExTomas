
public class PrincipalApp {
	public static void main (String []args) {
		int [] edades = {12,18,5,66,29,8,20,65};
		CalcularEdad examen = new CalcularEdad(edades); 
		
		examen.calcularEdades(edades);
	}
}
