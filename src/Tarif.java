public class Tarif {
    private int prix;
    private boolean estPaye = false;

    public Tarif(int prix) {
        this.prix = prix;
    }

    public void payer(){
        estPaye = true;
    }
}
