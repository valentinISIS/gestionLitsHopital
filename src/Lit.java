public abstract class Lit {
    private long tempsOccupationMaximal;
    private boolean occuper = false;
    private Patient patient;
    private int tarif;
    private Chambre chambre;

    public Lit(long tempsOccupationMaximal, int tarif, Chambre chambre) {
        this.tempsOccupationMaximal = tempsOccupationMaximal;
        this.tarif = tarif;
        this.chambre = chambre;
    }
    public boolean estLibre(){
        return !occuper;
    }
    public long gettempsOccupationMaximal(){
        return tempsOccupationMaximal;
    }

    public void setPatient(Patient patient) {
        this.patient.setLit(null);
        this.patient = patient;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public int getTarif() {
        return tarif;
    }

    public Patient getPatient() {
        return patient;
    }
}