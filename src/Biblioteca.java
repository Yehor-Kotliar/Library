public class Biblioteca {

    private Libro[] libri = new Libro[100];
    private int numeroLibri = 0;

    {
        System.out.println("\nBiblioteca creata");
    }

    public Biblioteca() { }

    public void aggiungiLibro(Libro l) {

        if (numeroLibri < libri.length) {
            libri[numeroLibri++] = l;
            System.out.println("Libro aggiunto: " + l.getTitolo());
        }
    }

    public void aggiungiPiuLibri (Libro... libriDaAggiungere) {
        for (Libro l : libriDaAggiungere) {
            aggiungiLibro(l);
        }
    }

    public void cercaLibro (String titolo) {
        System.out.println();
        for (int i = 0; i < numeroLibri; i++) {
            if(libri[i].getTitolo() != null && libri[i].getTitolo().equalsIgnoreCase(titolo)) {
                System.out.println("Il libro e' stato trovato:  " + libri[i]);
                return;
            }
        }
        System.out.println("Libro \"" + titolo + "\" non trovato");
    }

    public void stampaLibri () {

        System.out.println("\n\nLista dei libri in biblioteca:");

        for (int i = 0; i < numeroLibri; i++) {
            System.out.println(libri[i]);
        }
    }

}
