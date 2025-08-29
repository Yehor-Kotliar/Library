public class Biblioteca {

    private Libro[] libri = new Libro[100];
    private int numeroLibri = 0;

    {
        System.out.println("Biblioteca creata");
    }

    public Biblioteca() { }

    public void aggiungiLibro(Libro l) {

        if (numeroLibri < libri.length) {
            libri[numeroLibri++] = l;
            System.out.println("Libro aggiunto: " + l.getTitolo());
        }
    }

    public void cercaLibro (String titolo) {
        for (int i = 0; i < numeroLibri; i++) {
            if(libri[i].getTitolo() != null && libri[i].getTitolo().equals(titolo)) {
                System.out.println("Il libro e' stato trovato:");
                System.out.println(libri[i]);
                return;
            }
        }
        System.out.println("Libro non trovato");
    }

    public void stampaLibri () {

        System.out.println("Lista dei libri in biblioteca:");

        for (int i = 0; i < numeroLibri; i++) {
            System.out.println(libri[i]);
        }
    }

    public void aggiungiPiuLibri (Libro... libriDaAggiungere) {
        for (Libro l : libriDaAggiungere) {
            aggiungiLibro(l);
        }
    }

}
