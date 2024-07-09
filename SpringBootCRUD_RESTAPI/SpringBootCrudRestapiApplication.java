package com.example.SpringBootCRUD_RESTAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringBootCRUD_RESTAPI.Model.Faculty;
import com.example.SpringBootCRUD_RESTAPI.Repository.FacultyRepository;

@SpringBootApplication
public class SpringBootCrudRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudRestapiApplication.class, args);
	}

	@SuppressWarnings("unused")
	@Autowired
	private FacultyRepository facultyRepository;
	@Override
	public void run(String... args) throws Exception {
//		
//		Faculty faculty3 =new Faculty();
//		faculty3.setEmailid("Rahul@gmail.com");
//		faculty3.setId(5);
//		faculty3.setLastName("Rahul");
//		faculty3.setFirstName("Akkiraju");
//		facultyRepository.save(faculty3);
//		
//		
//		
//
//		Faculty faculty2 =new Faculty();
//		faculty2.setEmailid("Rahul@gmail.com");
//		faculty2.setId(6);
//		faculty2.setLastName("Rahul");
//		faculty2.setFirstName("Akkiraju");
//		facultyRepository.save(faculty2);
//		
	}
	
	
	
	
	
	

}
