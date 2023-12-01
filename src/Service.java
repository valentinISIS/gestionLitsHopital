import java.util.HashSet;
import java.util.Set;

public class Service {
    private String nom;
    private int numero;
    private Set<Chambre> chambres = new HashSet<>();
    private TypeLit typeLit;

    public Service (String nom, int numero, TypeLit typeLit){
        this.nom=nom;
        this.numero=numero;
        this.typeLit = typeLit;
    }

    public void ajouterChambre(TypeChambre type){
        String numeroChambre = String.valueOf(numero);
        if (chambres.size() < 9) numeroChambre = numeroChambre + "0" + chambres.size();
        else numeroChambre = numeroChambre + chambres.size();

        if (type == TypeChambre.DOUBLE) chambres.add(new ChambreDouble(Integer.valueOf(numeroChambre), typeLit, this));
        else chambres.add(new ChambreSimple(Integer.valueOf(numeroChambre), typeLit, this));
    }
    public Set<Chambre> getChambres(){
        return chambres;
    }
}

