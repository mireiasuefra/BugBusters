package service;

import java.util.List;

import model.Juego;


public interface GestionJuegosService {
	
	void cargarDatosCSV();
	List<Juego> listarJuegos();
	void crearJuego();

}
