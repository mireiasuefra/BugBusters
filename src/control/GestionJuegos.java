package control;

import service.GestionJuegosService;
import service.GestionJuegosServiceImpl;

public class GestionJuegos {

	private GestionJuegosService gestionJuegosService = new GestionJuegosServiceImpl();
	

	public void cargarDatos() {
		
		gestionJuegosService.cargarDatosCSV();
	}

}

