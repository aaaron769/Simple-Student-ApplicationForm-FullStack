package com.simple.studentregistrationfom.app.controller;

import com.simple.studentregistrationfom.app.model.Student;
import com.simple.studentregistrationfom.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/admission",method = RequestMethod.GET)
    public ModelAndView getAdmission(){
        ModelAndView modelAndView = new ModelAndView("admissionForm");

        return  modelAndView;
    }

    @RequestMapping(value = "/firstSpringMVCProject/submitAdmissionForm.html",method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@ModelAttribute("student1")Student student1){
        ModelAndView modelAndView = new ModelAndView("admissionSuccess");
        modelAndView.addObject("headerMessage","MUM.edu in FairFild");

        studentService.save(student1);
        return  modelAndView;

    }


}
