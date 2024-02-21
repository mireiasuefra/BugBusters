package control;

import service.GestionJuegosService;

public class GestionJuegos {

	private GestionJuegosService gestionJuegosService;

	public void cargarDatos() {
		gestionJuegosService.cargarDatosCSV();
	}

}
