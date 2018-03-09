package uk.co.timesheet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import uk.co.timesheet.controller.LoginInterceptor;

@Configuration
public class WebAppConfiguration extends WebMvcConfigurerAdapter {
	// para resolver o problema de nao encontrar CSS
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	// utilizacao de interceptor para seguranca de login - habilitar a classe
    @Bean
    LoginInterceptor loginInterceptor() {
         return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor());
    }
	
}
