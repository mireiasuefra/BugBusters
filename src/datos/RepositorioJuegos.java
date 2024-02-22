package datos;

import model.Genre;
import model.Juego;
import model.Platform;

import java.util.List;

public interface RepositorioJuegos {

	int cargarDatosCSV();

	List<Juego> listadoJuegos();
	
	void darDeAlta(Juego juego);
	
	List<Juego> listadoPorGenero(Genre genero);
	
	List<Juego> listadoPorPlataforma(Platform plataforma);

}