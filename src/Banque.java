
public class Banque {
    private int nCompte;
    private float solde;
    private String cin;
    public Banque(int nCompte, float solde, String cin) {
        this.nCompte = nCompte;
        this.solde = solde;
        this.cin = cin;}
    public void deposer(float somme){
        this.solde += somme;}
    public void retirer(float somme){
        if (this.solde > somme)
            this.solde -= somme;}
    public float avoirSolde() {
        return solde;}
    public String avoirInf() {
        return "Compte{" +
                "nCompte=" + nCompte +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';}
}