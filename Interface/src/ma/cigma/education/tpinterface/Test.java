package ma.cigma.education.tpinterface;

public class Test {
    public static void main(String[] args) {
        ICalcul i1 = new CalculImpl();
        CalculImpl i2 = new CalculImpl();

        int s1 = i1.sous(1, 2);
        int s2 = i2.sous(2, 5);

        System.out.println(s1);
        System.out.println(s2);


        i2.seConnecter();
      


    }
}
