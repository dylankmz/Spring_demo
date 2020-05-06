package be.ehb.thymeleaf.controller;


import be.ehb.thymeleaf.model.Student;
import be.ehb.thymeleaf.model.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

//    @Autowired
//    StudentDAO dao;
//
//    @RequestMapping(value = "/students", method = RequestMethod.GET)
//    @ResponseBody
//    public Iterable<Student> getAllStudents() {
//        return dao.findAll();
//    }
//
//    @RequestMapping(value = "/studentsbyid", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Student> getStudentById(@PathVariable(value = "id") int id) {
//        return dao.getStudentById(id);
//    }
}
