public class Libro {

    private String titolo;
    private String autore;
    private int anno;
    private boolean disponibile;

    {
        titolo = "Sconosciuto";
        autore = "Anonimo";
        anno = 0;
        disponibile = true;
    }

    public Libro (String titolo, String autore, int anno, boolean disponibile) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.disponibile = disponibile;
    }

    public Libro(String titolo, String autore) {
        this(titolo, autore, 0, true);
    }

    public String getTitolo() {return titolo;}
    public void setTitolo(String titolo) {this.titolo = titolo;}

    public String getAutore() {return autore;}
    public void setAutore(String autore) {this.autore = autore;}

    public int getAnno() {return anno;}
    public void setAnno(int anno) {this.anno = anno;}

    public boolean getDisponibile() {return disponibile;}
    public void setDisponibile(boolean disponibile) {this.disponibile = disponibile;}

    public void prestito() {
        if(disponibile) {
            disponibile = false;
            System.out.println("\nHai preso in prestito: " + titolo);

        } else {
            System.out.println("\nLibro non e' disponibile.");
        }
    }

    public void restituzione() {
        if(!disponibile){
            disponibile = true;
            System.out.println("\nGrazie per avere restituito il libro");
        } else {
            System.out.println("\nIl libro non era stato prestato.");
        }
    }

    @Override
    public String toString (){
        return "Libro: " + titolo + " di " + autore +
                " (" + anno + ") - " +
                (disponibile ? "Disponibile" : "Indisponibile");
    }
}
