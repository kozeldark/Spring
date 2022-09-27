package gcu.backend.stuservice.services;

import java.util.List;
import java.util.Optional;

import gcu.backend.stuservice.models.Student;

public interface IStudent {
	List<Student> getAllStudents();
    Optional<Student> findById(int id);
    Optional<Student> findByEmail(String email);
    Student save(Student std);
    void deleteById(int id);
}
