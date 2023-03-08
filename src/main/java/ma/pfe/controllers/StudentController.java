package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.repositories.StudentRepositoryImpl;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService service;
    StudentController(StudentService service){
        this.service=service;

    }
    @PostMapping("/save")
    public long create(@RequestBody StudentDto dto){
        LOG.debug("start method save");

        return service.create(dto);

    }
    @PostMapping
    public boolean update(@RequestBody StudentDto dto){
        LOG.debug("start method update");

        return service.update(dto);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
        LOG.debug("start method delete");

        return service.delete(id);
    }
    @GetMapping
    public List<StudentDto> readAll(){
        LOG.debug("start method select All");

        return service.readAll();
    }
    private final static Logger LOG = LoggerFactory.getLogger(StudentRepositoryImpl.class);












}
