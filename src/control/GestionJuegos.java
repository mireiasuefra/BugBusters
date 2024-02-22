package control;

import java.util.List;

import gui.GUI;
import model.Juego;
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
			
			switch(opcion) {
			case 1: //Listar juegos
				List<Juego> lista = gestionJuegosService.listarJuegos();
				GUI.mostrarListaJuegos(lista);
				break;
			case 2: //Dar de alta
				gestionJuegosService.crearJuego();
				break;
			case 0: //Salir del programa
				System.out.println("Saliendo del programa...");
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					System.out.println("Ha habido un problema al intentar salir del programa.");
				}
				break;
			default: //Si no se marca una opcion correcta
				System.out.println("No has elegido una opcion correcta.");
				break;
			}
		} while(opcion != 0);
	}
}
