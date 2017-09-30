/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.Models.Users;

import java.util.Date;

/**
 *
 * @author o5k4r1n
 */
public class Principal {
	private String name;
	private String lastname;
	private String sex;
	private String address;
	private Date date_of_birth;
	private int ci;
	private String photo_name;

	public Principal(){}

	public Principal(String name, String lastname, String sex, String address, Date date_of_birth, int ci, String photo_name) {
		this.name			= name;
		this.lastname		= lastname;
		this.sex			= sex;
		this.address		= address;
		this.date_of_birth	= date_of_birth;
		this.ci				= ci;
		this.photo_name		= photo_name;
	}
	public Principal(String name, String lastname, String sex, String address, Date date_of_birth, int ci) {
		this.name			= name;
		this.lastname		= lastname;
		this.sex			= sex;
		this.address		= address;
		this.date_of_birth	= date_of_birth;
		this.ci				= ci;
	}
	public String getPhoto_name() {
		return photo_name;
	}

	public void setPhoto_name(String photo_name) {
		this.photo_name = photo_name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}
	
	
}
