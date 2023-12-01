import java.util.Map;

public interface IStrategieAdmission {
    Lit getMeilleurLit(Service service, Preference preference);
    void miseAJour(Lit lit);
}
