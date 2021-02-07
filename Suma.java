import java.util.Scanner;

public class Suma{
	static Scanner entrada = new Scanner(System.in);

	public static void main(String args[]){

		int num1 = 0;
		int num2 = 0;
		int resultado = 0;

		System.out.println("Digite el primer numero: ");
		num1 = entrada.nextInt();
		System.out.println("Digite el segundo numero: ");
		num2 = entrada.nextInt();
		
		resultado = num1 + num2;
		if (resultado < 3){
			System.out.println("Resultado incorrecto, es : " + resultado);
		}
		else {
			System.out.println("Tu resultado de la suma es : " + resultado);
			mensaje();
		}
	}

	public static void mensaje(){
		for (int i = 0; i < 2; i++) {
		System.out.println("ola wenas");

		}
	}	
}