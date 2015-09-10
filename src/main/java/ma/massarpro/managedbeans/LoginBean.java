package ma.massarpro.managedbeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import ma.massarpro.beans.Etudiant;
import ma.massarpro.dao.DAOFactory;
import ma.massarpro.utils.applicationContextUtils;

import org.primefaces.context.RequestContext;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@ManagedBean(name="loginMB")
public class LoginBean {

	private String username;
	
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login(ActionEvent actionEvent) {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage msg = null;
		boolean loggedIn = false;
		ApplicationContext ac = applicationContextUtils.getApplicationContext();
		DAOFactory dao = (DAOFactory) ac.getBean("DAOFactory");
		
		for (Etudiant e : dao.getEtudiantDAO().listEtudiant()) {
			if(username != null  && username.equals(e.getLogin()) && password != null  && password.equals(e.getPassword())) {
				loggedIn = true;
				msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenue", username);
				break;
			} else {
				loggedIn = false;
				msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Invalid credentials");
			}
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
		context.addCallbackParam("loggedIn", loggedIn);
	}
}
						