package uk.co.timesheet.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Timesheet {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	private String employee;
	private String project;
	private String fase;
	private Calendar startDate;
	private Calendar endDate;
	private String comment;
	
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
