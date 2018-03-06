package uk.co.timesheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import uk.co.timesheet.dao.TimesheetDAO;
import uk.co.timesheet.model.Timesheet;

@Controller
public class TimesheetController {
	@Autowired
	TimesheetDAO dao;

	@GetMapping(value="/form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("form");
		return modelAndView;
	}
	
	@PostMapping(value="/form")
	public ModelAndView addTimesheet(Timesheet timesheet) {
		System.out.println("Estou no Controller");
		dao.save(timesheet);
		ModelAndView modelAndView = new ModelAndView("redirect:form");
		modelAndView.addObject("mensagem", "Estou no POST");
		return modelAndView;
	}
	
	
}
