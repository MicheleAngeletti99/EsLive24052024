public class Studente extends Persona {

    private String gruppoMusicalePreferito;

    public Studente(String nome, String cognome, Integer eta, String gruppoMusicalePreferito) {
        super(nome, cognome, eta);
        this.gruppoMusicalePreferito = gruppoMusicalePreferito;
    }

    public String getGruppoMusicalePreferito() {
        return gruppoMusicalePreferito;
    }

    public void setGruppoMusicalePreferito(String gruppoMusicalePreferito) {
        this.gruppoMusicalePreferito = gruppoMusicalePreferito;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Gruppo musicale preferito: " + gruppoMusicalePreferito);
    }
}
