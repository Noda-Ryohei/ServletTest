package servlet;

import java.io.Serializable;

public class ContactBean implements Serializable {

	private String name;
	private String company;
	private String email;
	private String content;
	private String[] magazines;
	private String requestDocs;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String[] getMagazines() {
		return magazines;
	}
	public void setMagazines(String[] magazines) {
		this.magazines = magazines;
	}
	
	public String getRequestDocs() {
		return requestDocs;
	}
	public void setRequestDocs(String reqestDocs) {
		this.requestDocs = reqestDocs;
	}
	
}
