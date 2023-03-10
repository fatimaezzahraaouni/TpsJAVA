package ma.education.cigma.tpcollections;

import java.util.HashSet;
import java.util.Set;

public class TesthashSet {
    public static void main(String [] args){
        Set<Voiture> set= new HashSet<>();
        set.add(new Voiture(20.0, "BW"));
        set.add(new Voiture(30.0, "A20"));
        set.add(new Voiture(20.0, "BW"));
        set.add(new Voiture(20.0, "BW"));

        System.out.println(set);

    }
}
