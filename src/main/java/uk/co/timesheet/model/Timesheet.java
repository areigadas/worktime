package uk.co.timesheet.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Timesheet {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String employee;
	private String project;
	private String fase;
	@DateTimeFormat(pattern="dd/MM/yyyy hh:mm")
	private Calendar startDate;
	@DateTimeFormat(pattern="dd/MM/yyyy hh:mm")
	private Calendar endDate;
	@Lob
	private String comment;
	
	public Timesheet() {		
	}
	
	public Timesheet(String employee, String project, String fase, Calendar startDate, Calendar endDate,
			String comment) {
		super();
		this.employee = employee;
		this.project = project;
		this.fase = fase;
		this.startDate = startDate;
		this.endDate = endDate;
		this.comment = comment;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public Calendar getEndDate() {
		return endDate;
	}
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
