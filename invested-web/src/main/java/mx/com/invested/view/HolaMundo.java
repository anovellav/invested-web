package mx.com.invested.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean (name = "holaMundoController", eager = true)
@RequestScoped
public class HolaMundo implements Serializable{

	private static final long serialVersionUID = -4714946174001869609L;
	@ManagedProperty(value = "#{param.usuario}")
	private String usuario = "";
	@ManagedProperty(value = "#{param.password}")
	private String password = "";

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String datosUsuario() {
		return "success";
	}
	
	public String logout() {
		return "success";
	}

	public String showGreeting() {
		
		return "Hola " + usuario + "!";
	}

}
