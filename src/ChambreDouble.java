public class ChambreDouble extends Chambre{

    private final static int SUPPLEMENT = 1;

    public ChambreDouble (int num, TypeLit typeLit, Service service){
        super(num, Preference.DOUBLE, service);
        switch (typeLit){
            case AMBULATOIRE -> {
                this.setLits(new Lit[]{new LitAmbulatoire(this),new LitAmbulatoire(this)});
                this.setSupplement(SUPPLEMENT);
            }
            case LONG_SEJOUR -> {
                this.setLits(new Lit[]{new LitMoyenSejour(this), new LitMoyenSejour(this)});
                this.setSupplement(SUPPLEMENT);
            }
            case MOYEN_SEJOUR -> {
                this.setLits(new Lit[]{new LitLongSejour(this), new LitLongSejour(this)});
                this.setSupplement(SUPPLEMENT);
            }
        }
    }
}
