package cargaDatosTest;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import datos.RepositorioJuegosImpl;
import datos.RepositorioJuegos;

import model.Juego;

public class cargaDatosTest {
	
	private static byte cont = 1;
	private RepositorioJuegos repoJuegos = new RepositorioJuegosImpl();
	private static Logger logger;
//	private List<Juego> listado;

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
			logger.info(">>> PRUEBA UNITARIA "+(cont++)+" <<<");
		}
		
		@AfterClass
		public static void onceExecutedAfterAll() {
			logger.info(">>> Terminado las pruebas unitarias");
		}

		@Test
		public void testLongitudListado() {
			logger.info("Test::testLongitudListado(): Que listado contenga tantos valores como el CSV");
			int longitudCSV = repoJuegos.cargarDatosCSV();
			int longitudListado = repoJuegos.getListado().size();
			assertTrue(longitudCSV == longitudListado);
		}
}
