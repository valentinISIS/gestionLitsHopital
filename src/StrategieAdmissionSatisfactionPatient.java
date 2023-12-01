import java.util.ArrayList;
import java.util.List;

public class StrategieAdmissionSatisfactionPatient implements IStrategieAdmission{
    @Override
    public Lit getMeilleurLit(Service service, Preference preference) {
        Chambre chambreNonConforme = null;
        for (Chambre chambre:service.getChambres()) {
            if (chambre.estLibre()){
                if ((preference == chambre.getPreference())) return chambre.getLitLibre();
                else chambreNonConforme = chambre;
            }
        }
        return chambreNonConforme.getLitLibre();
    }

    @Override
    public void miseAJour(Lit lit) {
        List<Patient> patients = getPatientFromService(lit.getChambre().getService());
        for (Patient patient: patients) {
            if (patient.getPreference() != patient.getLit().getChambre().getPreference() && patient.getPreference() == lit.getChambre().getPreference()) {
                patient.setLit(lit);
                return;
            }
        }
    }

    private List<Patient> getPatientFromService(Service service){
        List<Patient> patients = new ArrayList<>();
        for (Chambre chambre: service.getChambres()) {
            for (Lit lit: chambre.getLits()) {
                patients.add(lit.getPatient());
            }
        }
        return patients;
    }
}
