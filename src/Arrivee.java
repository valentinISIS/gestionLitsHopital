import java.util.Date;

public class Arrivee {
    private Patient patient;
    private Lit lit;
    private Date date;

    public Arrivee(Patient patient, Lit lit, Date date) {
        this.patient = patient;
        this.lit = lit;
        this.date = date;
    }
}
