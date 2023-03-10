package ma.education.tp1.introduction;

public class Salle {
    long id;
    String nom;
    //Q1

    Salle() {
        System.out.println("Constructeure sans paramètres");
    }
    Salle(String nom){
        this.nom = nom;
        System.out.println("construre le nom de la salle");
    }

    Salle(long id, String nom){
        this(nom);
        this.id=id;
        System.out.println("Un constructeur pour l’id et le nom de la salle");
    }

    //Q5 et Q6
    public static void main(String[] args) {
        Salle o1= new Salle();
        Salle o2= new Salle("Salle informatique");
        Salle o3= new Salle(2, "Salle des cours");
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

    }

}