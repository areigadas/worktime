package uk.co.timesheet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Configuration
public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
        
        String uri = request.getRequestURI();
		if(request.getSession().getAttribute("usuarioLogado") != null) {
			System.out.println("LOGADO");
        return true;
		}
        
        if(uri.endsWith("worktime/") || uri.endsWith("worktime")  ||
                uri.endsWith("allTasks") ||  uri.endsWith("login") ||
                        uri.contains("resources")){
        		System.out.println("Fora da lista");
            return true;
        }

		System.out.println("NAO LOGADO");
        response.sendRedirect("/worktime");
        return false;
	}

}
