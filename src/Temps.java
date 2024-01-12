
public class Temps {
    private int heures;
    private  int minutes;
    private int secondes;

    public Temps(){}
    public Temps(int heures){
        this.heures = heures;
    }
    public Temps(int heures , int minutes){
        this(heures);
        this.minutes = minutes;
    }
    public Temps(int heures , int minutes , int secondes){
        this(heures, minutes);
        this.secondes = secondes;
    }
    public  Temps(Temps T){
        this.heures=getHeures();
        this.minutes=getMinutes();
        this.secondes=getSecondes();
    }

    public int getHeures() {
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }
    public void AjouterHeures(int h){
        this.heures +=h;
        if(h>23){
            this.heures %= 24;
        }
    }
    public void AjouterMinutes(int m){
        this.minutes += m;
        if(m>59){
            AjouterMinutes(minutes/60);
            this.minutes %=60;
        }
    }

    public void AjouterSecondes(int s){
        this.secondes += s;
        if(s>59){
            AjouterMinutes(secondes/60);
            this.secondes %=60;
        }
    }

    @Override
    public String toString() {
        return "heures = " + heures + "minutes = " + minutes + "secondes = " + secondes+ ".";
    }

}