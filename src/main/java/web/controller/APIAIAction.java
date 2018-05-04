package web.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
 
@ManagedBean(name="apiAIAction")
@ViewScoped
public class APIAIAction {
	private String message="";
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void submit() {
		System.out.println("submitited");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
 
}
