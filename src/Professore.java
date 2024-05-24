public class Professore extends Persona {

    private String libroPreferito;

    public Professore(String nome, String cognome, Integer eta, String libroPreferito) {
        super(nome, cognome, eta);
        this.libroPreferito = libroPreferito;
    }

    public String getLibroPreferito() {
        return libroPreferito;
    }

    public void setLibroPreferito(String libroPreferito) {
        this.libroPreferito = libroPreferito;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Libro Preferito: " + libroPreferito);
    }
}
