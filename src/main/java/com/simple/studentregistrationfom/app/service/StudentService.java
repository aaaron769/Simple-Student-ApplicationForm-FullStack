package com.simple.studentregistrationfom.app.service;

import com.simple.studentregistrationfom.app.model.Student;
import com.simple.studentregistrationfom.app.serviceImp.StudentServiceImp;
import org.springframework.stereotype.Service;

@Service
public interface StudentService  {
    Student save(Student student);

}
