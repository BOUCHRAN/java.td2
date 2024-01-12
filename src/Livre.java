
public class Livre {
    private String titre,auteur;
    private float prix;
    private int annee;

    public Livre(){}
    public  Livre(String titre){
        this.titre = titre;
    }
    public  Livre (String titre ,String auteur){
        this(titre);
        this.auteur= auteur;
    }
    public Livre (String titre ,String auteur ,float prix){
        this(titre, auteur);
        this.prix=prix;
    }
    public Livre(String titre ,String auteur ,float prix ,int annee){
        this(titre, auteur, prix);
        this.annee = annee;
    }
    public Livre( Livre L){
        this.titre=L.getTitre();
        this.auteur =L.getAuteur();
        this.prix = L.getPrix();
        this.annee =L.getAnnee();
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public float getPrix() {
        return prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return " titre=" +titre + "auteur =" + auteur + "prix =" + prix + "annee = "+ annee+ ".";
    }
}