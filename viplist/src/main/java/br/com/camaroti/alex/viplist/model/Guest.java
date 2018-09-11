package br.com.camaroti.alex.viplist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VIPLIST")
public class Guest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="SQ_ID_VIPLIST")
	@SequenceGenerator(name="SQ_ID_VIPLIST", sequenceName="SQ_ID_VIPLIST", allocationSize = 1)
	private Long id;
	
	private String name;
	private String email;
	private String phone;
	
	public Guest() {
	}
	
	public Guest(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
