package repositoryJpa;

import entities.PersonnesEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by Aladinne on 09/10/2016.
 */
public class PersonDao {

    private EntityManager entityManager;

    public List<PersonnesEntity> findAllPersons() {
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("persistenceUnit");
        entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        List<PersonnesEntity> listPersons = entityManager.createQuery(
                "SELECT p FROM PersonnesEntity p").getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
        if (listPersons == null) {
            System.out.println("No persons found . ");
        } else {
            for (PersonnesEntity person : listPersons) {
                System.out.print("Person name= " + person.getNom());
            }
        }

        return listPersons;
    }

}




/*      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "persistenceUnit" );

        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        PersonnesEntity employee = new  PersonnesEntity( );
        employee.setId( 666666 );
        employee.setCin("381381");
        employee.setNom( "test JPA " );
        employee.setEmail("aladinnnne@gmail.com");
        employee.setPrenom("KORTASSO");
        employee.setType("Big Boss");


        entitymanager.persist( employee );
        entitymanager.getTransaction( ).commit( );

        entitymanager.close( );
        emfactory.close( );*/