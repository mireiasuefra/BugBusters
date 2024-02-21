package model;

public class Juego {
	private String nombre;
	private int fechaPublicacion;
	private String editor;
	private Platform plataforma;
	private Genre genero;

	public Juego() {
		super();
	}

	public Juego(String nombre, int fechaPublicacion, String editor, Platform plataforma, Genre genero) {
		super();
		this.nombre = nombre;
		this.fechaPublicacion = fechaPublicacion;
		this.editor = editor;
		this.plataforma = plataforma;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(int fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Platform getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Platform plataforma) {
		this.plataforma = plataforma;
	}

	public Genre getGenero() {
		return genero;
	}

	public void setGenero(Genre genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nFechaPublicacion: " + fechaPublicacion + "\nEditor: " + editor
				+ "\nPlataforma: " + plataforma + "\nGenero=" + genero + "\n\n";
	}
}

