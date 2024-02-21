package service;

import java.util.List;

import model.Juego;

public interface GestionJuegosService{
	public void cargarDatosCSV();
	public List<Juego> listarJuegos();

}
