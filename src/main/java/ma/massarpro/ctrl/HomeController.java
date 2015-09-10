package ma.massarpro.ctrl;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import ma.massarpro.beans.Etudiant;
import ma.massarpro.dao.DAOFactory;
import ma.massarpro.utils.applicationContextUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	DAOFactory dao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model,HttpSession session) {
		logger.info("hada log locale kayn f {}.", locale);
		
		Boolean isLogged = (Boolean) session.getAttribute("isLogged");
		if(isLogged==null || isLogged==false)
			return "login";
		
		
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		
		return "login";
	}
	
	@RequestMapping(value = "/sacha", method = RequestMethod.GET)
	public String sacha(Locale locale, Model model) {
		
		return "index2";
	}
	
	
}
