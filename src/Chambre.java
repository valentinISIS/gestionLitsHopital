import java.util.HashSet;
import java.util.Set;

public abstract class Chambre{
    private int num;
    private Lit[] lits;
    private int supplement;
    private Preference preference;
    private Service service;


    public Chambre(int num, Preference preference, Service service) {
        this.num = num;
        this.preference = preference;
        this.service = service;
    }

    public Lit[] getLits(){
        return lits;
    }

    public boolean estLibre(){
        for (Lit lit: lits) {
            if (!lit.estLibre()) return true;
        }
        return false;
    }

    public void setLits(Lit[] lits) {
        this.lits = lits;
    }

    public void setSupplement(int supplement) {
        this.supplement = supplement;
    }

    public int getSupplement() {
        return supplement;
    }

    public Lit getLitLibre(){
        if (!estLibre()) return null;
        for (Lit lit: lits) {
            if (lit.estLibre()) return lit;
        }
        return null;
    }

    public Preference getPreference() {
        return preference;
    }

    public Service getService() {
        return service;
    }
}