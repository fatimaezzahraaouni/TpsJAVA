package ma.education.tp.teste;

import ma.education.tpsingleton.Soliel;

public class Teste {

	public static void main(String[] args) {
		Soliel s1=Soliel.getInstance(3000.5);
		Soliel s2=Soliel.getInstance(2000.5);
	     System.out.println(s1.surface);
	     System.out.println(s2.surface);

	} //fin main

} //fin de class
