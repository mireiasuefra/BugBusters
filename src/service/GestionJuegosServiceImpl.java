package service;

import java.util.List;

import datos.RepositorioJuegos;
import datos.RepositorioJuegosImpl;
import model.Juego;

public class GestionJuegosServiceImpl implements GestionJuegosService {
	private RepositorioJuegos listaJuegos = new RepositorioJuegosImpl();

	@Override
	public void cargarDatosCSV() {
		listaJuegos.cargarDatosCSV();
	}

	public List<Juego> listarJuegos() {
		List<Juego> listado = listaJuegos.listadoTodos();

		return listado;
	}

}
