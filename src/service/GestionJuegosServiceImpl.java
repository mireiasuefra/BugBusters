package service;

import java.util.List;

import datos.RepositorioJuegos;
import datos.RepositorioJuegosImpl;
import gui.GUI;
import model.Genre;
import model.Juego;
import model.Platform;
import utilidades.Utilidades;

public class GestionJuegosServiceImpl implements GestionJuegosService {
	private RepositorioJuegos listaJuegos = new RepositorioJuegosImpl();

	@Override
	public void cargarDatosCSV() {
		listaJuegos.cargarDatosCSV();
	}

	public List<Juego> listarJuegos() {
		List<Juego> listado = listaJuegos.listadoJuegos();

		return listado;
	}

	@Override
	public void crearJuego() {
		System.out.println("\n>>> Creando nuevo Juego...\n");
		String nombre = Utilidades.leerMensaje("Introduce Nombre: ");
		int fechaPublicacion = Utilidades.leerInt("Introduce Año Publicación: ");
		String editor = Utilidades.leerMensaje("Introduce Editor: ");

		GUI.mostrarListaPlataforma();
		String plataforma = Utilidades.leerMensaje("\nIntroduce Plataforma de la lista: ");

		GUI.mostrarListaGeneros();
		String genero = Utilidades.leerMensaje("\nIntroduce Género de la lista");
		Juego juego = new Juego(nombre, fechaPublicacion, editor, Platform.fromString(plataforma),
				Genre.fromString(genero));

		listaJuegos.darDeAlta(juego);
	}

}
