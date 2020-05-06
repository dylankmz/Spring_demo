package be.ehb.thymeleaf.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDAO extends CrudRepository<Student, Integer> {
}
