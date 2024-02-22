package juegosTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import datos.RepositorioJuegosImpl;
import gui.GUI;
import model.Genre;
import model.Juego;
import model.Platform;
import datos.RepositorioJuegos;

public class juegosTest {

	private static byte cont = 1;
	private RepositorioJuegos repoJuegos = new RepositorioJuegosImpl();
	private static Logger logger;

	static {
		try {
			logger = LogManager.getLogger(RepositorioJuegosImpl.class);
		} catch (Throwable e) {
			System.out.println("No funciona JUnit");
		}
	}

	@BeforeClass
	public static void onceExecutedBeforeAll() {
		logger.info(">>> Iniciando pruebas...");
	}

	@Before
	public void executedBeforeEach() {
		System.out.println("");
		logger.info(">>> PRUEBA UNITARIA " + (cont++) + " <<<");
	}

	@AfterClass
	public static void onceExecutedAfterAll() {
		logger.info(">>> Terminado las pruebas unitarias");
	}

	@Test
	public void testLongitudListado() {
		logger.info("Test::testLongitudListado(): Que listado contenga tantos valores como el CSV");
		int longitudCSV = repoJuegos.cargarDatosCSV();
		int longitudListado = repoJuegos.listadoJuegos().size();
		assertTrue(longitudCSV == longitudListado);
	}

	@Test
	public void testIncluyeWii() {
		logger.info(
				"Test::testIncluyeWii(): Sabemos que el CSV incluye un juego de la Wii, comprueba que nuestra lista lo contenga");
		boolean contieneWii = false;
		int i = 0;
		int longitudCSV = repoJuegos.cargarDatosCSV();
		List<Juego> listado = repoJuegos.listadoJuegos();
		while (!contieneWii && i < listado.size()) {
			if (listado.get(i).getPlataforma().equals(Platform.WII))
				contieneWii = true;
			i++;
		}
		assertTrue(contieneWii);
	}

	@Test
	public void testLongitudListadoMostradoGUI() {
		logger.info(
				"Test::testLongitudListadoMostradoGUI(): Comprobamos que el listado de nuestro RepositorioJuegos es igual de largo que la cantidad de valores que se muestran al llamar mostrarListadoJuegos en el GUI");
		int longitudCSV = repoJuegos.cargarDatosCSV();
		List<Juego> listado = repoJuegos.listadoJuegos();
		int longitudListado = listado.size();
		
		int cantidadMostrada = GUI.mostrarListaJuegos(listado);
		assertTrue(cantidadMostrada == longitudListado);
	}
	
	@Test
	public void testAumentadoListadoNuevoJuego() {
		logger.info(
				"Test::testAumentadoListadoNuevoJuego(): Comprobar que, al crear un juego, el número de juegos mostrados augmenta en 1");
		int longitudCSV = repoJuegos.cargarDatosCSV();
		List<Juego> listado = repoJuegos.listadoJuegos();
		int longitudAntes = listado.size();
		
		repoJuegos.darDeAlta(new Juego("GTA VI", 2026, "Rockstar Games", Platform.PC, Genre.ACTION));
		
		assertTrue((longitudAntes + 1) == listado.size());
	}
}
