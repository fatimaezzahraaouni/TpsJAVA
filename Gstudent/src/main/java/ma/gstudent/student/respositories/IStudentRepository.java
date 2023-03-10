package ma.gstudent.student.respositories;

import ma.gstudent.student.service.Student;

import java.util.List;

public interface IStudentRepository {
    boolean create(Student s);
    boolean update (Student s);
    boolean delete (long id);
    List<Student> select();
}
