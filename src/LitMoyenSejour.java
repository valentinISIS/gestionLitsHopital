public class LitMoyenSejour extends Lit {
    private final static int TARIF = 20;
    public LitMoyenSejour(Chambre chambre){
        super(14*24*60*60, TARIF, chambre);
    }
}