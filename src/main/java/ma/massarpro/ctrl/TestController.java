package ma.massarpro.ctrl;

import java.util.Date;
import java.util.Locale;

import ma.massarpro.beans.Absence_retard;
import ma.massarpro.beans.Etudiant;
import ma.massarpro.dao.DAOFactory;
import ma.massarpro.utils.applicationContextUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@Autowired
	DAOFactory dao;
	
	ApplicationContext ac;
	
	@RequestMapping(value = "/test/1", method = RequestMethod.GET)
	public String meth1(Locale locale, Model model) {
		
		ac= applicationContextUtils.getApplicationContext();
		Etudiant e = dao.getEtudiantDAO().getEtudiantByORMID(1);
		
		Absence_retard ab = dao.getAbsence_retardDAO().createAbsence_retard();
		ab.setDate(new Date());
		ab.setMatiere(dao.getMatiereDAO().getMatiereByORMID(1));
		ab.setJustifie(false);
		ab.setNumSean(2);
		ab.setVueEtud(false);
		ab.setVuePar(false);
		ab.setAbsence(true);
		
		e.absence_retard.add(ab);
		dao.getAbsence_retardDAO().save(ab);
		return "index";
	}
	
	@RequestMapping(value = "/test/2", method = RequestMethod.GET)
	public String meth2(Locale locale, Model model) {
		
		ac= applicationContextUtils.getApplicationContext();
		Etudiant e = dao.getEtudiantDAO().getEtudiantByORMID(1);
		e.setLogin("superyass");
		e.setPassword("123456");
		dao.getEtudiantDAO().save(e);
		
		return "index";
	}

}
