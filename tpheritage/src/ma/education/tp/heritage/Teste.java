package ma.education.tp.heritage;

public class Teste {
    public static void main(String[] args) {
        Personne p1= new Etudiante();
        Personne p2= new Professeur();
        Personne p3= new Personne();
        Etudiante e1= new Professeur();  //ne peux pas déclarée un objet par une class filles
        Professeur p4= new Etudiante();  //ne peux pas déclarée un objet par une class filles
        Etudiante e2= (Etudiante)p1;
        Professeur p5= (Professeur)p2;
        System.out.println(((Etudiante) p1).note);
        System.out.println(e2.note);
        System.out.println( ((Professeur) p2).salaire);
        System.out.println(p5.salaire);



    }
}
