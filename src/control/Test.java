package control;

import gui.GUI;

public class Test {

	public static void prueba() {
		GestionJuegos gestionJuegos = new GestionJuegos();

		GUI.mostrarMenu();

		gestionJuegos.cargarDatos();

	}

}
