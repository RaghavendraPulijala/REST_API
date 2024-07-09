package com.example.SpringBootCRUD_RESTAPI.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Getter
// @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Faculty")
public class Faculty {
	public Long getId() {
		return id;
	}
	public void setId(int i) {
		this.id = (long) i;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="first_Name")
	private String FirstName;
	@Column(name="Last_Name")
	private String LastName;
	@Column(name="eMail_id")
	private String Emailid;
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	
	
	
	

}
