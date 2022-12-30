package com.springboot.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Studenttable")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="Id")
private Long id;
@Column(name="Name")
private String name;
	@Column(name="Email")
private String email;

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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public Student(String name, int id, String email) {
	super();
	this.name = name;
	this.id = id;
	this.email = email;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", email=" + email + "]";
}

}
