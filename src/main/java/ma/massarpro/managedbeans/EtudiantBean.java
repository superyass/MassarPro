package ma.massarpro.managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ma.massarpro.beans.Etudiant;
import ma.massarpro.dao.DAOFactory;
import ma.massarpro.utils.applicationContextUtils;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@ManagedBean(name="etu")
@SessionScoped
public class EtudiantBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	DAOFactory dao;
	
	private List<Etudiant> listet;
	
	public EtudiantBean() {
		ApplicationContext ac = applicationContextUtils.getApplicationContext();
		dao = (DAOFactory) ac.getBean("DAOFactory");
		System.out.println(">>>>>>>>>>>>>>>>>");
		listet = new ArrayList<Etudiant>();
	}
	
	public List<Etudiant> getListet() {
		listet =dao.getEtudiantDAO().listEtudiant();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<");
		return listet;
	}

	
}
