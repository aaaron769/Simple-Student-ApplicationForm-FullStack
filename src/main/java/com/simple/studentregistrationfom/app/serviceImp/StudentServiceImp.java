package com.simple.studentregistrationfom.app.serviceImp;

import com.simple.studentregistrationfom.app.model.Student;
import com.simple.studentregistrationfom.app.repository.StudentRepository;
import com.simple.studentregistrationfom.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
