package utilidades;

import java.util.Scanner;

public class Utilidades {
	public Utilidades() {

	}

	public static String leerMensaje(String mensaje) {
		System.out.print(mensaje);
		return new Scanner(System.in).nextLine();
	}

	public static int leerInt(String mensaje) {

		System.out.print(mensaje);

		int valor = 0;
		boolean valido = false;

		while (!valido) {
			try {
				valor = Integer.parseInt(new Scanner(System.in).nextLine());
				valido = true;
			} catch (NumberFormatException e) {
				System.out.print("Eso no es un numero entero. Introduce un número: ");
			}
		}
		return valor;
	}
}
