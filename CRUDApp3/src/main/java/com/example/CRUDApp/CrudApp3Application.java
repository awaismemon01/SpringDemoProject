package com.example.CRUDApp;

import com.example.CRUDApp.Entity.Course;
import com.example.CRUDApp.Entity.Instructor;
import com.example.CRUDApp.Entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApp3Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudApp3Application.class, args);

		SessionFactory factory = new Configuration().configure()
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try{

//			Instructor instructor1 =new Instructor("Jack","Black","jack@gmail.com");
//			InstructorDetail instructorDetail1 =new InstructorDetail("JACK's Channel","Blogging");

//			Instructor instructor2 =new Instructor("James","Gunn","james@gmail.com");
//			InstructorDetail instructorDetail2 =new InstructorDetail("JAMES' Channel","Directing Movies");

//			instructor1.setInstructorDetail(instructorDetail1);
//			instructor2.setInstructorDetail(instructorDetail2);

			session.beginTransaction();

			int id = 1;
			Instructor instructor = session.get(Instructor.class,id);

			System.out.println(instructor.getCourses());
			Course course = session.get(Course.class,10);

			session.delete(course);

//			Course course1 = new Course("Java");
//			Course course2 = new Course("Python");

//			instructor.add(course1);
//			instructor.add(course2);

//			session.save(course1);
//			session.save(course2);

			session.getTransaction().commit();
		}
		finally {
			session.close();

			factory.close();
		}
	}

}
