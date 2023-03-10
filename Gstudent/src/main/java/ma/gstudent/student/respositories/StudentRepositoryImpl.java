package ma.gstudent.student.respositories;

import ma.gstudent.student.service.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements IStudentRepository{
    List<Student> data= new ArrayList<Student>();

    public boolean create(Student s) {
        System.out.println("Repository: CREATE: Student " +s);
        data.add(s);
        System.out.println("DATA"+ data);
        return true;

    }


    public boolean update(Student s) {
        System.out.println("Repository: update: Student " +s);
        data.stream().filter(
                x -> {
                    boolean b = x.getId()==s.getId();
                    if(b){
                        int index = data.indexOf(x);
                        data.set(index,s);
                    }
                    return b;
                });
        return true;
    }

    public boolean delete(long id) {
        System.out.println("Repository: delete: Student " );
        data.stream().filter(
                x -> {
                    boolean b = x.getId()==id;
                    if(b){
                        int index = data.indexOf(x);
                        data.remove(index);
                    }
                    return b;
                });
        return true;
    }

    public List<Student> select() {
        return select();
    }






}
