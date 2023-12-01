public class Patient {
    private String nom;
    private String noss;
    private Lit lit;
    private Preference preference;

    public Patient(String nom, String noss) {
        this.nom = nom;
        this.noss = noss;
    }

    public Lit getLit() {
        return lit;
    }

    public void setLit(Lit lit) {
        this.lit.setPatient(null);
        this.lit = lit;
    }

    public Preference getPreference() {
        return preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
    }
}
