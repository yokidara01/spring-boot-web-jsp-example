package repositoryJpa;

/**
 * Created by Aladinne on 08/10/2016.
 */

import entities.PersonnesEntity;
import org.springframework.data.repository.*;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface PersonneRepository extends CrudRepository<PersonnesEntity, Integer> {



    List<PersonnesEntity> findAll();




}