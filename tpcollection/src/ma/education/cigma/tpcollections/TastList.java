package ma.education.cigma.tpcollections;

import java.util.ArrayList;
import java.util.List;

public class TastList {
     public static void main(String[] args) {
         List<Voiture> l= new ArrayList<>();
         l.add(new Voiture(20.0, "A10"));

         l.add(new Voiture(30.0, "B20"));

         l.add(new Voiture(20.0, "A10"));

         l.add(1,new Voiture(40.0, "C40"));
         System.out.println(l);

    }
    //fin main
}
//fin test