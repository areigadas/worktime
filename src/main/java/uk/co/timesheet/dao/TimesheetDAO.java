package uk.co.timesheet.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uk.co.timesheet.model.Timesheet;

@Repository
@Transactional
public class TimesheetDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	List<Timesheet> list = new ArrayList<>();

	public void save(Timesheet timesheet) {
		manager.persist(timesheet);	
	}

	public List<Timesheet> getListOpenTasks() {
		Calendar start = Calendar.getInstance();
		list.add(new Timesheet("Adriana", "Teste MVC", "Fase1", start, null, "vai dar certo."));
		list.add(new Timesheet("Martin", "Dynatrace", "Fase1", start, null, "já deu."));
		list.add(new Timesheet("Felipe", "Nursery", "Animals", start, null, "Lion"));

		return list;
	}
	
	public List<Timesheet> getListAllTasks() {
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		end.add(Calendar.DAY_OF_MONTH, 1);
		list.add(new Timesheet("Adriana", "Teste MVC", "Fase1", start, end, "finalizada"));
		list.add(new Timesheet("Martin", "Dynatrace", "Fase1", start, end, "finalizada deu."));
		list.add(new Timesheet("Felipe", "Nursery", "Animals", start, end, "finalizada"));

		return list;		
	}
}
