public class Tarif {
    private int prixJournalier;
    private boolean estPaye = false;
    private int nbJours = 1;

    public Tarif(int prixJournalier) {
        this.prixJournalier = prixJournalier;
    }

    public void payer(){
        estPaye = true;
    }
    public void nouvelleJournee(){
        nbJours += 1;
    }

    public int getMontant(){
        return nbJours*prixJournalier;
    }
}
