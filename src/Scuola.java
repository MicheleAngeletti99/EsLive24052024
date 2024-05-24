public class Scuola {

    private String nome;
    private Persona[] arrPersone;

    public Scuola(String nome, Persona[] arrPersone) {
        this.nome = nome;
        this.arrPersone = arrPersone;
    }

    public Persona[] getArrPersone() {
        return arrPersone;
    }

    public void setArrPersone(Persona[] arrPersone) {
        this.arrPersone = arrPersone;
    }

    public void setPersonaByIndex(Persona persona, int index) {
        this.arrPersone[index] = persona;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void stampaPersone() {
        System.out.println("Le persone registrate in questa scoula sono:");
        for (int i = 0; i < arrPersone.length; i++) {
            System.out.println("Persona all'indice " + i + ": ");
            arrPersone[i].stampaDettagli();
        }
    }

    public void stampaStudenti() {
        System.out.println("Gli studenti registrati in questa scuola sono:");
        for (Persona persona : arrPersone) {
            if (persona instanceof Studente) {
                persona.stampaDettagli();
            }
        }
    }

    public void stampaProfessori() {
        System.out.println("I professori registrati in questa scuola sono:");
        for (Persona persona : arrPersone) {
            if (persona instanceof Professore) {
                persona.stampaDettagli();
            }
        }
    }
}
