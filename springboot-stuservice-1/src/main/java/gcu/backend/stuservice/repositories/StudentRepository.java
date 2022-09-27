package gcu.backend.stuservice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import gcu.backend.stuservice.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	// Query method
    Optional<Student> findByEmail(String email);
}
