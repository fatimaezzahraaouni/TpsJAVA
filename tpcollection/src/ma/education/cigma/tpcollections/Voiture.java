package ma.education.cigma.tpcollections;

public class Voiture {
    double poids;
    String matericule;

    Voiture(double poids, String matericule){
        this.matericule =matericule;
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Voiture{" + "poids=" + poids +", matericule='" + matericule + '\n' +'}';
    }
}
