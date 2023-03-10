package ma.cigma.education.tpinterface;

public class CalculImpl2 implements ICalcul {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int mult(int a, int b) {
        return a-b;
    }

    @Override
    public int sous(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }

    @Override
    public int somme(int a, int b) {
        return a+b;
    }
}
