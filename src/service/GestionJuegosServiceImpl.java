package service;

import datos.RepositorioJuegos;
import datos.RepositorioJuegosImpl;

public class GestionJuegosServiceImpl implements GestionJuegosService {
	private RepositorioJuegos listaJuegos = new RepositorioJuegosImpl();
	
	@Override
	public void cargarDatosCSV() {
		listaJuegos.cargarDatosCSV();
	}

}
