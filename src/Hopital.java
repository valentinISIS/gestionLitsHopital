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

    public Set<Service> getServices() {
        return services;
    }

    public float getTauxOccupation(TypeLit typeLit){
        int chambreOccuper = 0;
        int chambreTotales = 0;
        for (Service service: services) {
            if (service.getTypeLit() == typeLit){
                for (Chambre chambre: service.getChambres()) {
                    for (Lit lit: chambre.getLits()) {
                        chambreTotales ++;
                        if (!lit.estLibre()){
                            chambreOccuper++;
                        }
                    }
                }
            }
        }
        if (chambreTotales == 0) return -1;
        return chambreOccuper/chambreTotales;
    }
}
