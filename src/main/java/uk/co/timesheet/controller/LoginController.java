package uk.co.timesheet.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import uk.co.timesheet.dao.UsuarioDAO;
import uk.co.timesheet.model.Usuario;

@Controller
public class LoginController {
	@Autowired
	UsuarioDAO dao;
	
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public ModelAndView login(Usuario user, HttpSession session) {
        if(dao.isLogado(user.getEmail(),user.getPassw())!=null) {
    			System.out.println("controller: USUARIO logado "+user.getEmail()+"-"+user.getPassw());
            session.setAttribute("usuarioLogado", user);
        }else
    			System.out.println("controller: USUARIO NAO logado "+user.getEmail()+"-"+user.getPassw());

        return new ModelAndView("redirect:/");
    }

}
