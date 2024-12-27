package tareacompU7;

public class Main {

	public static void main(String[] args) {
		Libro libro1 = new Libro("El principito", "Antonine de Saint-Exupéry", 96);
		Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);

		// metodos del primer objeto
		libro1.Detalles();
		System.out.println("Tiempo de lectura: " + libro1.tiempoLectura() + " horas.");
		libro1.esCorto();

		// metodos del segundo objeto
		libro2.Detalles();
		libro2.esCorto();
		libro2.cambiarAutoria("Nuevo Autor Anónimo");

	}
}
