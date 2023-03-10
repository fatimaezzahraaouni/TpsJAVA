package ma.education.factory;

import java.util.Scanner;

public class JeuMain {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Merci de donner la vitesse");
        int vts=sc.nextInt();


        VoitureFactory factory=new VoitureFactory();
        Voiture v= factory.commanderVoiture(vts);
        v.accelerer();

        sc.close();
    }
}
