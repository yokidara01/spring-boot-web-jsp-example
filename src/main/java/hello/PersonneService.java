package hello;

import entities.PersonnesEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repositoryJpa.PersonDao;

import java.util.List;

/**
 * Created by Aladinne on 08/10/2016.
 */
@RestController
public class PersonneService {
    @RequestMapping(value ="/all",method = RequestMethod.GET)

    public List<PersonnesEntity> getAll() {


        PersonDao personDao = new PersonDao() ;
      return   personDao.findAllPersons();

    }


}
