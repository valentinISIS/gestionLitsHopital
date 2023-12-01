public class LitLongSejour extends Lit {
    private final static int TARIF = 25;
    public LitLongSejour(Chambre chambre){
        super(30*24*60*60, TARIF, chambre);
    }
}