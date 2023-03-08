package ma.pfe.repositories;

import javassist.bytecode.stackmap.TypeData;
import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentRepositoryImpl implements StudentRepository{

    private final static Logger LOG =  LoggerFactory.getLogger(StudentRepositoryImpl.class);
    private  StudentRepository repository;

    StudentEntity e = new StudentEntity();
    @Override
    public Long create(StudentEntity e) {
        LOG.debug("start methode create");
        Long result = repository.create(e);
        return result;
    }

    @Override
    public boolean update(StudentEntity e) {
        LOG.debug("start methode update");
        boolean result = repository.update(e);
        return result;
    }

    @Override
    public boolean delete(Long id) {
        LOG.debug("start methode delete");
        return repository.delete(id);
    }

    @Override
    public List<StudentEntity> readAll() {
        LOG.debug("start methode update");
        LOG.debug("start methode delete");
        return null;
    }



}
