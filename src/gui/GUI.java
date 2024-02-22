package gui;

import java.util.List;
import java.util.Set;

import model.Genre;
import model.Juego;
import model.Platform;

public class GUI {

	public static void mostrarMenu() {

		System.out.println(">>>>>>> MENÚ LUCASTEAM <<<<<<<");
		System.out.println("\t1. Mostrar listado Juegos");
		System.out.println("\t2. Dar de Alta un Juego");
		System.out.println("\t3. Filtrar por Género");
		System.out.println("\t4. Filtrar por Plataforma");
		System.out.println("\t5. Mostrar lista Editores");
		System.out.println("\t0. Salir");
		System.out.println(">>>>>>>>>>>        <<<<<<<<<<<");

	}

	public static int mostrarListaJuegos(List<Juego> listado) {

		System.out.println("\n>>>  Mostrando Listado de Juegos\n");

		int cantJuegos = 0;

		for (Juego j : listado) {
			System.out.print("Nombre: " + j.getNombre());
			System.out.print("  Año: " + j.getFechaPublicacion());
			System.out.print("  Editor: " + j.getEditor());
			System.out.print("  Plataforma: " + j.getPlataforma().getPlataforma());
			System.out.println("  Género: " + j.getGenero().getGenero());
			cantJuegos++;
		}
		System.out.println("\n>>>  Se han mostrado " + cantJuegos + " juegos\n");

		return cantJuegos;
	}

	public static void mostrarListaPlataforma() {
		System.out.println("\n>>> Mostrando Plataformas disponibles");
		for (Platform p : Platform.values())
			System.out.println("--> " + p.getPlataforma());
	}

	public static void mostrarListaGeneros() {
		System.out.println("\n>>> Mostrando Géneros disponibles");
		for (Genre g : Genre.values())
			System.out.println("--> " + g.getGenero());
	}

	public static int mostrarListaEditores(Set<String> editores) {
		int cantidad = 0;
		System.out.println("\n>>> Mostrando todos los Editores de los Videojuegos en el Repositorio");
		for(String e: editores) {
			System.out.println("--> " + e);
			cantidad++;
		}
		System.out.println("\nExisten " + cantidad + " Editores diferentes en el repositorio\n");
		return cantidad;
	}
}