package com.rest.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="logdata")
public class LogData {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;

	@Column(name="coderepogroup")
	private String coderepogroup;
	@Column(name="coderepofolf")
	private String coderepofolf;
	@Column(name="coderepoliason")
	private String coderepoliason;
	@Column(name="coderepolevy")
	private String coderepolevy;
	
	public LogData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LogData(int id, String coderepogroup, String coderepofolf, String coderepoliason, String coderepolevy) {
		super();
		this.id = id;
		this.coderepogroup = coderepogroup;
		this.coderepofolf = coderepofolf;
		this.coderepoliason = coderepoliason;
		this.coderepolevy = coderepolevy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoderepogroup() {
		return coderepogroup;
	}
	public void setCoderepogroup(String coderepogroup) {
		this.coderepogroup = coderepogroup;
	}
	public String getCoderepofolf() {
		return coderepofolf;
	}
	public void setCoderepofolf(String coderepofolf) {
		this.coderepofolf = coderepofolf;
	}
	public String getCoderepoliason() {
		return coderepoliason;
	}
	public void setCoderepoliason(String coderepoliason) {
		this.coderepoliason = coderepoliason;
	}
	public String getCoderepolevy() {
		return coderepolevy;
	}
	public void setCoderepolevy(String coderepolevy) {
		this.coderepolevy = coderepolevy;
	}
	
	
}
