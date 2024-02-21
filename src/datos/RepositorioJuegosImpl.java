package datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gui.GUI;
import model.Genre;
import model.Juego;
import model.Platform;

public class RepositorioJuegosImpl implements RepositorioJuegos {

	// comentario para probar que hay cambios en mainArnau

	private List<Juego> listado = new ArrayList<Juego>();

//	private int longitud

	@Override
	public int cargarDatosCSV() {

		int longCSV = 0;
		try (Scanner scanner = new Scanner(new File("res/juegos.csv"))) {
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				listado.add(leerJuegoString(scanner.nextLine()));
				++longCSV;
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage() + "res/juegos.csv not found");
		}
		GUI.mostrarListaJuegos(listado);
		return longCSV;

	}

	private Juego leerJuegoString(String linea) {

//		String[] datosJuego = linea.split(",(?!\\s)");
		

		Juego juego = new Juego();
		int fecha = 0;
		
		
		if(!linea.contains("\"")) {
			String[] datosJuego = linea.split(",");
			datosJuego = linea.split(",");
			juego.setNombre(datosJuego[1]);
			juego.setPlataforma(Platform.fromString(datosJuego[2]));
			try {
				fecha = Integer.parseInt(datosJuego[3]);
			} catch (NumberFormatException e) {
				e.getMessage();
			} finally {
				juego.setFechaPublicacion(fecha);
			}

			juego.setGenero(Genre.fromString(datosJuego[4]));
			juego.setEditor(datosJuego[5]);
		}		

//		String[] datosJuego = linea.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
//		String modifiedLine = linea.replaceAll("(?<!\")\\,", "_");

//		String[] datosJuego = modifiedLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
//		String modifiedLine = linea.replaceAll(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", ";");

//		String[] datosJuego = linea.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
//		String[] datosJuego = modifiedLine.split("_");
	
//		System.out.println(datosJuego[0]);
//		System.out.println(datosJuego[1]);
//		System.out.println(datosJuego[2]);
//		System.out.println(datosJuego[3]);
//		System.out.println(datosJuego[4]);
//		System.out.println(datosJuego[5]);

		
		return juego;

	}

	@Override
	public List<Juego> getListado() {
		return listado;
	}

}
