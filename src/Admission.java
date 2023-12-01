import java.security.InvalidParameterException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Admission {
    private Map<Arrivee, Tarif> logAdmission;
    private Hopital hopital;

    public Admission(Hopital hopital) {
        this.hopital = hopital;
    }

    public void affecter(Patient patient, Service service, Preference preference, IStrategieAdmission strategieAdmission){
        if (getPatient().contains(patient)) throw new InvalidParameterException("Patient existant");
        patient.setPreference(preference);
        Lit lit = strategieAdmission.getMeilleurLit(service, preference);
        int tarif;
        if ((preference == preference.SIMPLE && lit.getChambre() instanceof ChambreSimple) || (preference == preference.DOUBLE && lit.getChambre() instanceof ChambreDouble)) tarif = lit.getTarif() * lit.getChambre().getSupplement();
        else tarif = lit.getTarif();
        logAdmission.put(new Arrivee(patient, lit, new Date()), new Tarif(tarif));
        lit.setPatient(patient);
    }

    public void partir(Patient patient, IStrategieAdmission strategieAdmission){
        if (!getPatient().contains(patient)) throw new InvalidParameterException("Patient non existant");
        strategieAdmission.miseAJour(patient.getLit());
        patient.setLit(null);
    }

    private Set<Patient> getPatient(){
        Set<Patient> patients = new HashSet<>();
        for (Service service: hopital.getServices()) {
            for (Chambre chambre: service.getChambres()) {
                for (Lit lit: chambre.getLits()) {
                    if (!lit.estLibre()) patients.add(lit.getPatient());
                }
            }
        }
        return patients;
    }
}
