package ma.cigma.education.tpinterface;

public interface ICalcul {
    int add(int a, int b);
    int mult(int a, int b);
    int sous (int a, int b);
    int div (int a, int b);
     default int somme(int a, int b){
         return 0;
     } //les attribures sur interface ils sont par defaut public, final, static

     default void afficher(){

     }
}

