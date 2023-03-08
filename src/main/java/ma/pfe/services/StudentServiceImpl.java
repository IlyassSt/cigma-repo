package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import ma.pfe.repositories.StudentRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;
    @Autowired
    private StudentMapper mapper;
    private StudentService service;

    private final static Logger LOG = LoggerFactory.getLogger(StudentService.class);


    @Override
    public Long create(StudentDto dto) {
        LOG.debug("start methode create");
        long reslt = service.create(dto);
        return reslt;
    }

    @Override
    public boolean update(StudentDto dto) {
        LOG.debug("start methode update");
        boolean res = service.update(dto);
        return res;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("start methode delete");
        return service.delete(id);

    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug("start methode list");
        return null;

    }

}
