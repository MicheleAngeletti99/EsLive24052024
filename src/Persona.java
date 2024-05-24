public abstract class Persona {

    private String nome;
    private String cognome;
    private Integer eta;

    public Persona(String nome, String cognome, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public void stampaDettagli() {
        // Si potrebbe aggiungere "this." di fronte a nome cognome e eta
        // in questo modo si è sicuri che si fa riferimento ai campi di questa classe
        // ma in casi come questo non è necessario il this
        System.out.println("Nome: " + this.nome + "\tCognome: " + this.cognome + "\tEtà: " + this.eta);
    }
}
