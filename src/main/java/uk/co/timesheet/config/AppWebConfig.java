package uk.co.timesheet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
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
	
	@Bean
	public FormattingConversionService mvcConversionService(){
	    DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
	    DateFormatterRegistrar formatterRegistrar = new DateFormatterRegistrar();
	    formatterRegistrar.setFormatter(new DateFormatter("dd/MM/yyyy HH:mm"));
	    formatterRegistrar.registerFormatters(conversionService);

	    return conversionService;
	}

	
	
}
