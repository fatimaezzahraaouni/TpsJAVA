package ma.education.cigma.tpaabstract;

public class Test {
    public static void main(String[] args){
        FormeGeo f1= new FormeGeo() {
            @Override
            public double calculersurface() {
                return 0;
            }
        };
        FormeGeo f2= new FormeGeo() {
            @Override
            public double calculersurface() {
                return 0;
            }
        };
        FormeGeo f3= new Cercle();
        FormeGeo f4= new FormeGeo() {


            public double calculersurface() {
                return 10.0;
            }


        };
    }
}
