
public class Point {
    String nom;
    double absice;

    public Point(String nom,double absice){
        this.nom=nom;
        this.absice=absice;
    }

    public void afficher(){
        System.out.println("le nom est"  +  this.nom);
        System.out.println("absice est"  +  this.absice);

    }

    public void translate(double dx){
        this.absice += dx;
    }
}
