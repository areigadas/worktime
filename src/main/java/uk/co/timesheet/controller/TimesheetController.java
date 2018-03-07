package uk.co.timesheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.co.timesheet.dao.TimesheetDAO;
import uk.co.timesheet.model.Timesheet;

@Controller
public class TimesheetController {
	
	@Autowired
	TimesheetDAO dao;
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

	@RequestMapping(value="/form" ,method=RequestMethod.GET)
	public ModelAndView form(Timesheet timesheet) {
		ModelAndView modelAndView = new ModelAndView("form");
		return modelAndView;
	}
	
	@RequestMapping(value="/form" ,method=RequestMethod.POST)
	public ModelAndView addTimesheet(Timesheet timesheet, RedirectAttributes redirectAttributes) {
		dao.save(timesheet);
		redirectAttributes.addFlashAttribute("mensagem", "New timesheet added!");
		ModelAndView modelAndView = new ModelAndView("redirect:openedTasks");
		return modelAndView;
	}
	
	@RequestMapping (value="/openedTasks")
	public ModelAndView openedTasks() {
		List<Timesheet> list = dao.getListOpenTasks();
		ModelAndView modelAndView = new ModelAndView("listTasks");
		modelAndView.addObject("openedTasks", list);
		return modelAndView;
	}
	
	@RequestMapping (value="/allTasks")
	public ModelAndView allTasks() {
		List<Timesheet> listAll = dao.getListAllTasks();
		List<Timesheet> listOpened = dao.getListOpenTasks();

		ModelAndView modelAndView = new ModelAndView("allTasks");
		modelAndView.addObject("allTasks", listAll);
		modelAndView.addObject("openedTasks", listOpened);
		return modelAndView;
	}	
}
