package sumar;

public class Suma {

	public static void main(String[] args) {
		int num1=4, num2=3;
		int suma=sumarNum(num1, num2);
		System.out.println(suma);

	}
	
	/**
	 * 
	 * @param num1 - Recibe un número entero
	 * @param num2 - Recibe un número entero
	 * 
	 * @return - Devuelve la suma de los dos números
	 */
	public static int sumarNum(int num1, int num2) {
		return (num1+num2);
	}

}
