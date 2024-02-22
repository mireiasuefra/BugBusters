package datos;

import model.Juego;
import java.util.List;

public interface RepositorioJuegos {

	int cargarDatosCSV();

	List<Juego> listadoJuegos();
	
	void darDeAlta(Juego juego);
}