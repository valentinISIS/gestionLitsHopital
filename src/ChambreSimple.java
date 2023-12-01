public class ChambreSimple extends Chambre{

    private final static int SUPPLEMENT = 2;

    public ChambreSimple (int num, TypeLit typeLit, Service service){
        super(num, Preference.SIMPLE, service);
        switch (typeLit){
            case AMBULATOIRE -> {
                this.setLits(new Lit[]{new LitAmbulatoire(this)});
                this.setSupplement(SUPPLEMENT);
            }
            case LONG_SEJOUR -> {
                this.setLits(new Lit[]{new LitMoyenSejour(this)});
                this.setSupplement(SUPPLEMENT);
            }
            case MOYEN_SEJOUR -> {
                this.setLits(new Lit[]{new LitLongSejour(this)});
                this.setSupplement(SUPPLEMENT);
            }
        }
    }
}
