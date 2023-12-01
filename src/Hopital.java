import java.util.HashSet;
import java.util.Set;

public class Hopital {
    private String nom;
    private Set<Service> services = new HashSet<>();

    public Hopital(String nom) {
        this.nom = nom;
    }

    public void addService(String nom, TypeLit typeLit){
        if (services.size() == 9) throw new IllegalCallerException("trop de services");
        services.add(new Service(nom, services.size()+1, typeLit));
    }
}
