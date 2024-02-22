package control;

import java.util.List;

import gui.GUI;
import model.Genre;
import model.Juego;
import model.Platform;
import service.GestionJuegosService;
import service.GestionJuegosServiceImpl;
import utilidades.Utilidades;

public class GestionJuegos {

	private GestionJuegosService gestionJuegosService = new GestionJuegosServiceImpl();

	public void cargarDatos() {
		gestionJuegosService.cargarDatosCSV();
	}

	public void seleccionarOpciones() {
		int opcion = 0;

		do {
			GUI.mostrarMenu();
			opcion = Utilidades.leerInt("Elige una opcion: ");

			switch (opcion) {
			case 1: // Listar juegos
				List<Juego> lista = gestionJuegosService.listarJuegos();
				GUI.mostrarListaJuegos(lista);
				break;
			case 2: // Dar de alta
				gestionJuegosService.crearJuego();
				break;
			case 3: // Mostrar listado por género
				GUI.mostrarListaGeneros();
				String generoLeido = Utilidades.leerMensaje(">>>Introduce el Género por el que filtrar: ");
				Genre genero = null;
				do {
					genero = Genre.fromString(generoLeido);
					if (genero == null)
						generoLeido = Utilidades
								.leerMensaje("\tDebes introducir un género válido de la lista anterior: ");
				} while (genero == null);
				List<Juego> listadoFiltrado = gestionJuegosService.filtrarGenero(genero);
				GUI.mostrarListaJuegos(listadoFiltrado);
				break;
			case 4: // Mostrar listado por plataforma
				GUI.mostrarListaPlataforma();
				String plataformaLeido = Utilidades.leerMensaje(">>>Introduce la Plataforma por la que filtrar: ");
				Platform plataforma;
				do {
					plataforma = Platform.fromString(plataformaLeido);
					if (plataforma == null)
						plataformaLeido = Utilidades
								.leerMensaje("\tDebes introducir una Plataforma válida de la lista anterior: ");
				} while (plataforma == null);
				List<Juego> listadoPlataforma = gestionJuegosService.filtrarPlataforma(plataforma);
				GUI.mostrarListaJuegos(listadoPlataforma);
				break;
			case 5: //Mostrar lista Editores
				GUI.mostrarListaEditores(gestionJuegosService.listarEditores());
				break;
			case 0: // Salir del programa
				System.out.println("Saliendo del programa...");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					System.out.println("Ha habido un problema al intentar salir del programa.");
				}
				break;
			default: // Si no se marca una opcion correcta
				System.out.println("No has elegido una opcion correcta.");
				break;
			}
		} while (opcion != 0);
	}
}
