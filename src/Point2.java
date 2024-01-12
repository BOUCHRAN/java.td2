public class Point2 {
    String nom;
    double x;
    double y;

    public Point2(){}
    public Point2 ( String  nom, double x , double y){
        this.nom= nom;
        this.x=x;
        this.y=y;
    }

    public String getNom() {
        return nom;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double Norme(){
        return Math.sqrt(Math.pow(this.x,2))+Math.sqrt(Math.pow(this.y,2));
    }
}