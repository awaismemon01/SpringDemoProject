package com.example.CRUDApp;

import com.example.CRUDApp.Entity.Instructor;
import com.example.CRUDApp.Entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudApp2Application.class, args);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try{

//			Instructor instructor1 =new Instructor("Jack","Black","jack@gmail.com");
//			InstructorDetail instructorDetail1 =new InstructorDetail("JACK's Channel","Blogging");

//			Instructor instructor2 =new Instructor("James","Gunn","james@gmail.com");
//			InstructorDetail instructorDetail2 =new InstructorDetail("JAMES' Channel","Directing Movies");

//			instructor1.setInstructorDetail(instructorDetail1);
//			instructor2.setInstructorDetail(instructorDetail2);

			session.beginTransaction();

			int id = 2;
			InstructorDetail instructorDetail = session.get(InstructorDetail.class,id);


			System.out.println(instructorDetail);
			System.out.println(instructorDetail.getInstructor());

//			if(instructor != null)
//				session.delete(instructor);

//			session.save(instructor1);
//			session.save(instructor2);

			session.getTransaction().commit();
		}
		finally {
			session.close();

			factory.close();
		}
	}

}
