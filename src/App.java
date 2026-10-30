public class App {
    public static void main(String[] args) throws Exception {
       
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El Principito" , "Antoine de Saint-Exupery");

       
        Lector lector1 = new Lector("Ana Torres", "1002334766");
        Lector lector2 = new Lector("Carlos Ruiz", "1022489087");

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();

        System.out.println();
        System.out.println();
        lector1.tomarPrestado(libro2);

         System.out.println();
        lector1.devolverLibro();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();

    }
}