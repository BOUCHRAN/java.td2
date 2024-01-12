
public class Ex4 {
    public static void main(String []args){
        Temps T =new Temps(7,6,8);
        T.AjouterHeures(40);
        /*  System.out.println(T);*/
        T.AjouterMinutes(30);
        /* System.out.println(T);*/
        T.AjouterSecondes(180);
        /* System.out.println(T);*/
        System.out.println(T.toString());
    }
}
