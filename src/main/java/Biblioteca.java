package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Clase que gestiona una biblioteca con una colección de libros, proporcionando
 * funciones para agregar, eliminar y buscar libros tanto por título como por
 * autor
 * 
 * 
 * @author Ruth Noemí Guamán Albarracín (aka RuthG27)
 * @see <a href="https://github.com/RuthG27">Mi GitHub</a>
 * @version 07.03.2025
 * @since 2025
 * 
 */
public class Biblioteca {

	/**
	 * Lista de libros disponibles en la biblioteca.
	 * 
	 */
	private final List<Libro> libros;

	/**
	 * Constructor por defecto que inicializa la biblioteca sin libros.
	 */
	public Biblioteca() {
		libros = new ArrayList<>();
	}

	/**
	 * Constructor que inicializa la biblioteca con una lista de libros.
	 * 
	 * @param libros Lista inicial de libros en la biblioteca.
	 */
	public Biblioteca(List<Libro> libros) {
		this.libros = libros;
	}

	public boolean agregarLibro(Libro libro) {
		return libros.add(libro);
	}

	public boolean eliminarLibro(Libro libro) {
		return libros.remove(libro);
	}

	/**
	 * Obtiene la lista de libros disponibles en la biblioteca.
	 * 
	 * @return Lista de libros en la biblioteca.
	 */
	public List<Libro> getLibros() {
		return libros;
	}

	/**
	 * Busca un libro por su título en la biblioteca.
	 * 
	 * @param titulo Título del libro a buscar.
	 * @return El libro si se encuentra en la biblioteca, {@code null} si no existe.
	 * @test 1. Buscar un libro existente y comprobar que se encuentra
	 *       correctamente.
	 * @test 2. Buscar un libro que no existe y comprobar que devuelve {@code null}.
	 */
	public Libro encuentraLibroPorTitulo(String titulo) {
		for (Libro libro : libros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				return libro;
			}
		}
		return null;
	}

	/**
	 * @deprecated Este método ha quedado obsoleto. Se recomienda usar
	 *             {@link #encuentraLibrosPorAutor(String)} en su lugar.
	 * @param autor Autor del libro a buscar.
	 * @return El primer libro encontrado del autor, o {@code null} si no hay
	 *         coincidencias.
	 */
	@Deprecated
	public Libro encuentraLibroPorAutor(String autor) {
		for (Libro libro : libros) {
			if (libro.getAutor().equalsIgnoreCase(autor)) {
				return libro;
			}
		}
		return null;
	}

	/**
	 * Busca todos los libros de un autor determinado en la biblioteca.
	 * 
	 * @param autor Autor cuyos libros se desean buscar.
	 * @return Lista de libros escritos por el autor, o una lista vacía si no hay
	 *         coincidencias.
	 * @since 2.0
	 * @test 1. Buscar libros de un autor existente y comprobar la lista de
	 *       resultados.
	 * @test 2. Buscar libros de un autor que no tiene libros en la biblioteca y
	 *       verificar que devuelve una lista vacía.
	 */
	public List<Libro> encuentraLibrosPorAutor(String autor) {
		List<Libro> listaLibros = new ArrayList<>();
		for (Libro libro : libros) {
			if (libro.getAutor().equalsIgnoreCase(autor)) {
				listaLibros.add(libro);
			}
		}
		return listaLibros;
	}

}
