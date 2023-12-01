public class StrategieAdmissionPremierArriveePremierServi implements IStrategieAdmission{
    @Override
    public Lit getMeilleurLit(Service service, Preference preference) {
        Chambre chambreNonConforme = null;
        for (Chambre chambre:service.getChambres()) {
            if (chambre.estLibre()){
                if ((preference == preference.SIMPLE && chambre instanceof ChambreSimple) || (preference == preference.DOUBLE && chambre instanceof ChambreDouble)) return chambre.getLitLibre();
                else chambreNonConforme = chambre;
            }
        }
        return chambreNonConforme.getLitLibre();
    }

    @Override
    public void miseAJour(Lit lit) {
        return;
    }
}
