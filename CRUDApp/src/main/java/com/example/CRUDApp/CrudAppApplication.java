package com.example.CRUDApp;

import com.example.CRUDApp.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try{
//			Student tempStudent1 = new Student("Vin","Diesel","vin.diesel@gmail.com");
//			Student tempStudent2 = new Student("Tom","Cruise","tom.cruise@gmail.com");
//			Student tempStudent3 = new Student("Keanu","Reeves","keanu.reeves@gmail.com");
//			Student tempStudent4 = new Student("Paul","Walker","paul.walker@gmail.com");

			session.beginTransaction();

//			session.save(tempStudent1);
//			session.save(tempStudent2);
//			session.save(tempStudent3);
//			session.save(tempStudent4);

			List<Student> theStudents = session.createQuery("from Student").getResultList();


			for (Student item:
				 theStudents) {
				System.out.println(item);
			}


			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}
