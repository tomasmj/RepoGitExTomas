import java.util.Arrays;

public class CalcularEdad {
	private int [] edad;

	public CalcularEdad(int[] edad) {
		this.edad = edad;
	}

	public int[] getEdad() {
		return edad;
	}

	public void setEdad(int[] edad) {
		this.edad = edad;
	}
	
	public void calcularEdades(int [] edad) {
		int menores=0, mayores=0, jubilados=0;
		for(int i=0;i<edad.length;i++) {
			if(edad[i]<18) {
				menores++;
			}else if(edad[i]>=18) {
				mayores++;
			}else if(edad[i]>=65) {
				jubilados++;
			}
		}
		System.out.println("Menores de edad:" + menores + " Mayores de edad:" + mayores + " Jubilados:" + jubilados);
	}

	@Override
	public String toString() {
		return "CalcularEdad [edad=" + Arrays.toString(edad) + "]";
	}
}
