package ma.massarpro.ctrl;

import ma.massarpro.dao.DAOFactory;
import ma.massarpro.utils.applicationContextUtils;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EtudiantController {

	
	@RequestMapping(value="/etudiant/absences")
	public String etud(Model m) {
		
		ApplicationContext ac = applicationContextUtils.getApplicationContext();
		DAOFactory dao = (DAOFactory) ac.getBean("DAOFactory");
		m.addAttribute("tst", "info");
		return "absences";
	}
	
	
}
