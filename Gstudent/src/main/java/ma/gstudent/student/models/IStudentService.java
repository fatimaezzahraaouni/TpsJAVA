package ma.gstudent.student.models;

import ma.gstudent.student.service.Student;

import java.util.List;

public interface IStudentService {
    boolean crate(Student s);
    boolean update(Student s);
    boolean delete(long id);
    List<Student> select();
}
