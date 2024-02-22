package gui;

import java.util.List;

import model.Juego;

public class GUI {

	public static void mostrarMenu() {

		System.out.println(">>>>>>> MENÚ LUCASTEAM <<<<<<<");
		System.out.println("\t1. Mostrar listado Juegos");
		System.out.println(">>>>>>>>>>>        <<<<<<<<<<<");

	}

	public static void mostrarListaJuegos(List<Juego> listado) {

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

	}

}
