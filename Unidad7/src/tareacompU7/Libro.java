package tareacompU7;

public class Libro {
	// Atributos que tendra el libro
	private String titulo;
	private String autor;
	private int numeroPaginas;

	public Libro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;

	}

	// Metodo para mostrar los detalles del libro
	public void Detalles() {
		System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas);
	}
	// Metodo para calcular el tiempo de lectura

	public int tiempoLectura() {
		return numeroPaginas / 30; // Suponemos que lee 30 paginas por hora
	}

	// Metodo para comprobar si el libro es corto o largo
	public void esCorto() {
		if (numeroPaginas < 100) {
			System.out.println("El libro " + titulo + " es un libro corto.");

		} else {
			System.out.println("El libro " + titulo + " es un libro largo.");
		}
	}

	// Metodo para cambiar el autor de un libro
	public void cambiarAutoria(String nuevoAutor) {
		autor = nuevoAutor;
		System.out.println("El autor del libro " + titulo + " ha sido cambiado a " + autor + ".");

	}

	// El metodo toString representara el libro como texto
	public String toString() {
		return "Libro [Título=" + titulo + ", Autor=" + autor + ", Páginas=" + numeroPaginas + "]";
	}

}
