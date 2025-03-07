package test.java;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.Libro;

class LibroTest {

	List<Libro> libros = new ArrayList<Libro>();

	@BeforeEach
	void setUp() {
		Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1991);
		libros.add(libro);
	}

	@Test
	void testLibroInicial() {
		assertNotNull(libros);
		assertEquals(1, libros.size());
		assertEquals("El señor de los anillos", libros.get(0).getTitulo());
		assertEquals("J.R.R. Tolkien", libros.get(0).getAutor());
		assertEquals(1991, libros.get(0).getAnioPublicacion());
	}

	@Test
	void testNuevoLibro() {
		Libro libro = new Libro("Entorno de desarrollos", "Luis Garcia", 2025);
		libros.add(libro);
		assertNotNull(libros);
		assertEquals(2, libros.size());
		assertEquals("Entorno de desarrollos", libros.get(1).getTitulo());
		assertEquals("Luis Garcia", libros.get(1).getAutor());
		assertEquals(2025, libros.get(1).getAnioPublicacion());
	}

}
