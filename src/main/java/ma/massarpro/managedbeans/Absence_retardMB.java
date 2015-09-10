package ma.massarpro.managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ma.massarpro.beans.Absence_retard;
import ma.massarpro.dao.DAOFactory;
import ma.massarpro.utils.applicationContextUtils;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@ManagedBean(name="AbsenceretardMB")
@RequestScoped
//@SessionScoped
public class Absence_retardMB implements Serializable{
	
	DAOFactory dao;
	
	private List<Absence_retard> listet;
	private int nbrAbs;
	private int nbrAbsJus;
	private int nbrRtd;
	
	public Absence_retardMB() {
		ApplicationContext ac = applicationContextUtils.getApplicationContext();
		dao = (DAOFactory) ac.getBean("DAOFactory");
		listet = new ArrayList<Absence_retard>();
		listet = dao.getAbsence_retardDAO().listAbsence_retardByQuery(null, null);
		for (Absence_retard ar : listet) {
			if(ar.isAbsence()) {
				nbrAbs++;
				if(ar.getJustifie())
					nbrAbsJus++;
			}else
				nbrRtd++;
			
		}
	}

	public List<Absence_retard> getListet() {
		return listet;
	}

	public int getNbrAbs() {
		return nbrAbs;
	}
	
	public int getNbrAbsJus() {
		return nbrAbsJus;
	}

	public int getNbrRtd() {
		return nbrRtd;
	}

}
