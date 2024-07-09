package com.example.SpringBootCRUD_RESTAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootCRUD_RESTAPI.Model.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long>{
	
	// All crud Database Methods

}
