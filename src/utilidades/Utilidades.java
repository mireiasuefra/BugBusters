package utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
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
				valor = new Scanner(System.in).nextInt();
				valido = true;
			} catch (NumberFormatException e) {
				System.out.print("Eso no es un numero entero. Introduce un número: ");
			}
		}
		return valor;
	}

	public static float escribirFloat(String mensaje) {
		return leerMensaje(mensaje).nextFloat();
	}

	public static double escribirDouble(String mensaje) {
		return leerMensaje(mensaje).nextDouble();
	}

	public static String escribirString(String mensaje) {
		return leerMensaje(mensaje).nextLine();
	}

	public static boolean esPar(int numero) {
		if (numero % 2 == 0) {
			// System.out.println("El numero es par.");
			return true;
		}

		// System.out.println("El numero es impar.");
		return false;
	}

	public static void imprimirCadenaLetraALetra(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			if (i == cadena.length() - 1) {
				System.out.print(cadena.charAt(i) + "\n");
			} else {
				System.out.print(cadena.charAt(i) + ", ");
			}
		}
	}

	public static int generarNumeroAleatorio(int min, int max) {
		Random random = new Random();
		return random.nextInt(max) + min;
	}

	public static float calcularDescuento(float numero, float descuento) {
		return numero * (descuento / 100);
	}

	public static float calcularSubida(float numero, float subida) {
		return numero * (subida / 100 + 1);
	}

	public static void imprimirArrayInt(int[] array) {
		if (array.length == 0 || array == null) {
			System.out.println("0");
		} else {
			System.out.print("[");
			for (int i = 0; i < array.length; i++) {
				if (i != array.length - 1) {
					System.out.print(array[i] + ", ");
				} else {
					System.out.print(array[i] + "]");
				}
			}
			System.out.println("");
		}
	}

	public static void imprimirArrayListInt(ArrayList<Integer> array_list) {
		if (array_list.size() == 0 || array_list == null) {
			System.out.println("0");
		} else {
			System.out.print("[");
			for (int i = 0; i < array_list.size(); i++) {
				if (i != array_list.size() - 1) {
					System.out.print(array_list.get(i) + ", ");
				} else {
					System.out.print(array_list.get(i) + "]");
				}
			}
			System.out.println("");
		}
	}

	public static void imprimirArrayDouble(double[] array) {
		if (array.length == 0 || array == null) {
			System.out.println("0");
		} else {
			System.out.print("[");
			for (int i = 0; i < array.length; i++) {
				if (i != array.length - 1) {
					System.out.print(array[i] + ", ");
				} else {
					System.out.print(array[i] + "]");
				}
			}
			System.out.println("");
		}
	}

	public static void imprimirArrayListDouble(ArrayList<Double> array_list) {
		if (array_list.size() == 0 || array_list == null) {
			System.out.println("0");
		} else {
			System.out.print("[");
			for (int i = 0; i < array_list.size(); i++) {
				if (i != array_list.size() - 1) {
					System.out.print(array_list.get(i) + ", ");
				} else {
					System.out.print(array_list.get(i) + "]");
				}
			}
			System.out.println("");
		}
	}

	public static void imprimirArrayString(String[] array) {
		if (array.length == 0 || array == null) {
			System.out.println("0");
		} else {
			System.out.print("[");
			for (int i = 0; i < array.length; i++) {
				if (i != array.length - 1) {
					System.out.print(array[i] + ", ");
				} else {
					System.out.print(array[i] + "]");
				}
			}
			System.out.println("");
		}
	}

	public static void imprimirMatrizString(String[][] matriz) {
		if (matriz.length == 0 || matriz == null) {
			System.out.println("0");
		} else {
			for (int i = 0; i < matriz.length; i++) {
				System.out.print("[");
				for (int j = 0; j < matriz[i].length; j++) {
					if (j != matriz[i].length - 1) {
						System.out.print(matriz[i][j] + ", ");
					} else {
						System.out.print(matriz[i][j] + "]");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

	public static String reemplazarString(String cadena, String sustituir, String sustitucion) {
		return cadena.replaceAll(sustituir, sustitucion);
	}

	public static boolean esPalindromo(String cadena) {
		StringBuilder sb = new StringBuilder(cadena);
		if (cadena.toLowerCase().equals(sb.reverse().toString().toLowerCase())) {
			return true;
		}
		return false;
	}

	public static boolean comprobarRango(double numero, double min, double max) {
		return numero >= min && numero <= max;
	}

	public static void escribirArchivo(String ruta, String texto) {
		File archivo = new File(ruta);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(texto);
			salida.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ha habido un error");
		}
	}

	public static void leerArchivo(String ruta) {
		try {
			FileReader archivo = new FileReader(ruta);
			int i = 0;
			while ((i = archivo.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro el archivo");
		} catch (IOException e) {
			System.out.println("Hubo un error leyendo el archivo");
		}
	}

	public static boolean esLetra(String c) {
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < alfabeto.length(); i++) {
			String letra = "" + alfabeto.charAt(i);
			if (letra.equals(c.toLowerCase())) {
				return true;
			}
		}

		return false;
	}

}
