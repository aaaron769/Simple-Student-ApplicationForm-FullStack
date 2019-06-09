package com.simple.studentregistrationfom.app.repository;

import com.simple.studentregistrationfom.app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
