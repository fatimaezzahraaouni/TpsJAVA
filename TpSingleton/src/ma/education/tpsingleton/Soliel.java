package ma.education.tpsingleton;

public class Soliel {

	private static Soliel instance;  //attribute
	public double surface ;           //attribute
	
	private Soliel (double surface) {
		this.surface= surface;   //constructeure private
		
	}
	public static Soliel getInstance(double surface) {
		if(instance== null) {
			instance= new Soliel(surface);
		}
		return instance;
	}
	

}
