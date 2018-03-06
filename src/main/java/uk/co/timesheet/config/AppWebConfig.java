package uk.co.timesheet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import uk.co.timesheet.controller.TimesheetController;
import uk.co.timesheet.dao.TimesheetDAO;
import uk.co.timesheet.model.Timesheet;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses= {TimesheetController.class, Timesheet.class, TimesheetDAO.class})
public class AppWebConfig {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/views/");
	    resolver.setSuffix(".jsp");
	    return resolver;
	}
}
