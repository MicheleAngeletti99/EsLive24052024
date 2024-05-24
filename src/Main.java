public class Main {
    public static void main(String[] args) {
        Persona michele = new Professore("Michele", "Mangiacotti", 25, "Mamba mentality");
        michele.stampaDettagli();
        Persona riccardo = new Studente("Riccardo", "Cavaleri", 29, "Pink floyd");
        riccardo.stampaDettagli();

        Scuola scuola = new Scuola("Liceo scientifico", new Persona[]{michele, riccardo});
        scuola.stampaPersone();
        scuola.stampaProfessori();
        scuola.stampaStudenti();
    }
}