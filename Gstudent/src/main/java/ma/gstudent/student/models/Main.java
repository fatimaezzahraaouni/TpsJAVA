package ma.gstudent.student.models;

import ma.gstudent.student.respositories.StudentRepositoryImpl;
import ma.gstudent.student.service.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentRepositoryImpl s = new StudentRepositoryImpl();
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
       do{
        System.out.println("Saisir le nom ");
        String nom = scanner.nextLine();
        System.out.println("Saisir l'age ");
        int age = scanner.nextInt();
        System.out.println("Saisir l'id ");
        int id = scanner.nextInt();
        Student s1 = new Student(id,nom,age);
        System.out.println("Saisir l'operation (nombre)");
        System.out.println("1 -> create ");
        System.out.println("2 -> update ");
        System.out.println("3 -> delete");
        System.out.println("4 -> select");
        System.out.println("5 -> exit");
        choix = scanner.nextInt();
        switch (choix){
            case 1:
                s.create(s1);
                break;
            case 2:
                s.update(s1);
                break;
            case 3:
                s.delete(id);
                break;
            case 4:
                s.select();
                break;
            case 5:
                System.exit(0);
                break;


        }

    }while(choix!=0);
    }
}
