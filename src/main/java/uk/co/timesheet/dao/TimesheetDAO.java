package uk.co.timesheet.dao;

import org.springframework.stereotype.Repository;

import uk.co.timesheet.model.Timesheet;

@Repository
public class TimesheetDAO {

	public void save(Timesheet timesheet) {
		System.out.println("Estou no DAO");
		System.out.println(timesheet.getId());
		System.out.println(timesheet.getProject());
		System.out.println(timesheet.getEmployee());
	}

	
}
