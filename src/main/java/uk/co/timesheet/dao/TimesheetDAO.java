package uk.co.timesheet.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uk.co.timesheet.model.Timesheet;

@Repository
@Transactional
public class TimesheetDAO {
	
	@PersistenceContext
	private EntityManager em;

	public List<Timesheet> getListOpenTasks() {
		return em.createQuery("select t from Timesheet t where endDate is null", Timesheet.class).getResultList();
	}
	
	public List<Timesheet> getListAllTasks() {
		return em.createQuery("select t from Timesheet t where endDate is not null", Timesheet.class).getResultList();
	}
	
	public void adiciona(Timesheet timesheet) {
		em.persist(timesheet);	
	}

	public void remove(Integer id) {
		em.remove(findById(id));
	}

	private Timesheet findById(Integer id) {
		TypedQuery<Timesheet> query = em.createQuery("select distinct(t) from Timesheet t where t.id = :id", 
				Timesheet.class);
		query.setParameter("id", id);		
		return query.getSingleResult();
	}

	public void finishTask(Integer id) {
		Timesheet task  = findById(id);
		task.setEndDate(Calendar.getInstance());
		em.merge(task);
	}
}
