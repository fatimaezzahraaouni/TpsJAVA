package treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String args[]){
        Comparator<Pc> pcComparator= (a,b)-> a.serial.length()- b.serial.length();
        Set s=new TreeSet(pcComparator);
        s.add(new Pc("ABC",30000));
        s.add(new Pc("AB",20000));
        s.add(new Pc("EFA",25000));
        s.add(new Pc("EF",23000));

        Iterator<Pc> itr= s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().serial);
        }


    }
}
