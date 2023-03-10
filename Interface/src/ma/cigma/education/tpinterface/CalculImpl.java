package ma.cigma.education.tpinterface;



public class CalculImpl implements ICalcul{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int mult(int a, int b) {
        return a*b;
    }

    @Override
    public int sous(int a, int b) {
        return a-b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }

    @Override
    public int somme(int a, int b) {
        return a+b;
    }
    int MONTANT =20 ;
    public void afficher() {
        System.out.println("A");

    }
    public void seConnecter(){
        System.out.println("Connecte");

    }
}
