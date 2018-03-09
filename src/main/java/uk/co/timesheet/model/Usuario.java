package uk.co.timesheet.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id  
	String email;
	String passw;
	String name;
	
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((passw == null) ? 0 : passw.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (passw == null) {
			if (other.passw != null)
				return false;
		} else if (!passw.equals(other.passw))
			return false;
		return true;
	}
	

	
}
