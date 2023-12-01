import java.time.LocalDateTime;
public class LitAmbulatoire extends Lit {
    private final static int TARIF = 15;
    public LitAmbulatoire(Chambre chambre){
        super(24*60*60, TARIF, chambre);
    }
}
