package org.example;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hillel-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        Student student = new Student();
        student.setFirstName("Денис");
        student.setLastName("Рожков");
        student.setEmail("@gmail.com");


        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
