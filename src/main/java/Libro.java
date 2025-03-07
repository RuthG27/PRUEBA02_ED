package main.java;

/**
 * 
 * Esta clase representa un libro dentro de la biblioteca, incluyendo su título,
 * autor y año de publicación.
 * 
 */

public class Libro {

	/** Título del libro */
	private String titulo;

	/** Autor del libro */
	private String autor;

	/** Año de publicación del libro */
	private int anioPublicacion;

	/**
	 * Constructor de la clase Libro.
	 *
	 * @param titulo          El título del libro.
	 * @param autor           El autor del libro.
	 * @param anioPublicacion El año en que se publicó el libro.
	 */
	public Libro(String titulo, String autor, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Obtiene el autor del libro
	 * 
	 * @return El autor del libro.
	 */
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Obtiene el año de publicación del libro.
	 * 
	 * @return El año de publicación del libro.
	 */
	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

}
