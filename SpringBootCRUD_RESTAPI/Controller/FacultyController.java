package com.example.SpringBootCRUD_RESTAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootCRUD_RESTAPI.Exception.ResourceNotFoundException;
import com.example.SpringBootCRUD_RESTAPI.Model.Faculty;
import com.example.SpringBootCRUD_RESTAPI.Repository.FacultyRepository;

// @CrossOrigin("*")
@RestController
@RequestMapping("/api/r1/faculty")
public class FacultyController {
	
	@Autowired
	private FacultyRepository facultyRepository;
	
	
	@GetMapping
	public List<Faculty> getAllEmployees()
	{
		return facultyRepository.findAll();
	}
	// build create faculty rest api
	@PostMapping
	public Faculty CreateFaculty( @RequestBody Faculty faculty)
	{
		return facultyRepository.save(faculty);
	}
	
	// buid get employee by id rest api
	@GetMapping("{id}")
	public ResponseEntity<Faculty> getFacultyById(@PathVariable long id)
	{
		Faculty faculty =facultyRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee doesnt exist with id "+id));
		return ResponseEntity.ok(faculty);
	}
	
	// build  update employee by id rest api 
	
	@PutMapping("{id}")
	public ResponseEntity<Faculty> updateEmployee(@PathVariable long id,@RequestBody Faculty facultydetails)
	{
		Faculty updatefaculty =facultyRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee not exist with id "+ id));
		
		updatefaculty.setFirstName(facultydetails.getFirstName());
		updatefaculty.setLastName(facultydetails.getLastName());
		updatefaculty.setEmailid(facultydetails.getEmailid());
		facultyRepository.save(updatefaculty);
		
		return ResponseEntity.ok(updatefaculty);
	}
	
	// build delete empployee rest api
	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable   long id)
	{
        Faculty faculty = facultyRepository.findById(id)
        		.orElseThrow(()->new ResourceNotFoundException("Employee does not exist +" +id));
        facultyRepository.delete(faculty);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
