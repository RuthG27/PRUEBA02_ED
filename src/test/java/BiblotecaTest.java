package test.java;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.Biblioteca;
import main.java.Libro;

class BiblotecaTest {

	Libro libro;
	Biblioteca biblioteca = new Biblioteca();

	@BeforeEach
	void setUp() {
		libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
	}

	@Test
	void agregarLibro() {
		assertTrue(biblioteca.agregarLibro(this.libro));
		assertEquals(1, biblioteca.getLibros().size());
		assertEquals("The Art of Computer Programming", biblioteca.getLibros().get(0).getTitulo());
		assertEquals("Donald Knuth", biblioteca.getLibros().get(0).getAutor());
		assertEquals(1968, biblioteca.getLibros().get(0).getAnioPublicacion());
	}

	@Test
	void eliminarLibro() {
		assertTrue(biblioteca.agregarLibro(this.libro));
		assertEquals(1, biblioteca.getLibros().size());

		assertTrue(biblioteca.eliminarLibro(this.libro));
		assertFalse(biblioteca.getLibros().contains(this.libro));
		assertEquals(0, biblioteca.getLibros().size());

	}

	@Test
	void testEncuentraLibroExistentePorTitulo() {
		assertTrue(biblioteca.agregarLibro(this.libro));
		assertEquals(1, biblioteca.getLibros().size());
		Libro libroFound = biblioteca.encuentraLibroPorTitulo("The Art of Computer Programming");
		assertEquals("The Art of Computer Programming", libroFound.getTitulo());
		assertEquals("Donald Knuth", libroFound.getAutor());
		assertEquals(1968, libroFound.getAnioPublicacion());

	}

	@Test
	void testEncuentraLibroNoExistentePorTitulo() {
		assertTrue(biblioteca.agregarLibro(this.libro));
		assertEquals(1, biblioteca.getLibros().size());
		Libro libroFound = biblioteca.encuentraLibroPorTitulo("Entorno de desarrollos");
		assertNull(libroFound);
	}

	@Test
	void testEncuentraLibrosExistentePorAutor() {
		assertTrue(biblioteca.agregarLibro(this.libro));
		assertEquals(1, biblioteca.getLibros().size());
		List<Libro> libros = biblioteca.encuentraLibrosPorAutor("Donald Knuth");
		assertEquals(1, libros.size());

	}

	@Test
	void testEncuentraLibrosNoExistentePorAutor() {
		assertTrue(biblioteca.agregarLibro(this.libro));
		assertEquals(1, biblioteca.getLibros().size());
		List<Libro> libros = biblioteca.encuentraLibrosPorAutor("Ruth Guamán");
		assertEquals(0, libros.size());

	}

}
