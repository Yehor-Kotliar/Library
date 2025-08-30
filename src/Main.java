public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1954, true);
        Libro libro2 = new Libro("1984", "George Orwell");
        Libro libro3 = new Libro("I Promessi Sposi", "Alessandro Manzoni", 1827, true);


        biblioteca.aggiungiLibro(libro1);
        biblioteca.aggiungiPiuLibri(libro2, libro3);

        biblioteca.stampaLibri();

        biblioteca.cercaLibro("il Signore degli Anelli");
        biblioteca.cercaLibro("Jeck");

        libro1.prestito();

        libro3.restituzione();

        biblioteca.stampaLibri();
    }
}
