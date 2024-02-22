package service;

import java.util.List;
import java.util.Set;

import model.Genre;
import model.Juego;
import model.Platform;


public interface GestionJuegosService {
	
	void cargarDatosCSV();
	
	List<Juego> listarJuegos();
	
	void crearJuego();

	List<Juego> filtrarGenero(Genre genero);

	List<Juego> 	filtrarPlataforma(Platform plataforma);

	Set<String> listarEditores();
}