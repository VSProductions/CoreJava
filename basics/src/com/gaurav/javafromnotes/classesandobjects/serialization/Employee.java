package com.gaurav.javafromnotes.classesandobjects.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -1453438159265899990L;
	String name;
	int id;
	transient String department;

	Employee(String name, int id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
