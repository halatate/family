package com.haden.family.data;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private int sex;
	private int role;
	private boolean owner_direct;

	private Family family;

	public Person() {
		super();
	}

	public Person(String name, int age, int sex, int role, boolean owner_direct) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.role = role;
		this.owner_direct = owner_direct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public boolean isOwner_direct() {
		return owner_direct;
	}

	public void setOwner_direct(boolean owner_direct) {
		this.owner_direct = owner_direct;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

}
