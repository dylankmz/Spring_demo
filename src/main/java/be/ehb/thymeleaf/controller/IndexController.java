package be.ehb.thymeleaf.controller;

import be.ehb.thymeleaf.model.Student;
import be.ehb.thymeleaf.model.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class IndexController {

    @Autowired
    StudentDAO dao;

    @ModelAttribute("all_students")
    public Iterable<Student> findAll() {
        return dao.findAll();
    }

    @ModelAttribute("new_student")
    public Student createNew() {
        return new Student();
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("new_student") @Valid Student newStudent, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "index";
        }
        dao.save(newStudent);
        return "redirect:/index";
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String showIndex() {
        return "index";
    }
}
